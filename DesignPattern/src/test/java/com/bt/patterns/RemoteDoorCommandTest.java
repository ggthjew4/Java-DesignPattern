package com.bt.patterns;

import org.junit.Assert;
import org.junit.Test;

import com.bt.bluetechnology.patterns.command.ICommand;
import com.bt.bluetechnology.patterns.command.IResult;
import com.bt.bluetechnology.patterns.command.RemoteDoor;
import com.bt.bluetechnology.patterns.command.RemoteDoorCommand;
import com.bt.mock.MockRemoteDoor;

public class RemoteDoorCommandTest {

	@Test
	public void testCommand_DoorOpen() {
		RemoteDoor door = new MockRemoteDoor("127.0.0.1","open");
		ICommand doorCmd = new RemoteDoorCommand(door);
		IResult result = doorCmd.execute();
		Assert.assertEquals(IResult.CRITICAL, result.getStatus());
		Assert.assertTrue(result.getMessage().startsWith("門被開啟"));
	}

	@Test
	public void testCommand_DoorClose() {
		RemoteDoor door = new MockRemoteDoor("127.0.0.1","close");
		ICommand doorCmd = new RemoteDoorCommand(door);
		IResult result = doorCmd.execute();
		Assert.assertEquals(IResult.OK, result.getStatus());
		Assert.assertTrue(result.getMessage().isEmpty());
	}
	
}
