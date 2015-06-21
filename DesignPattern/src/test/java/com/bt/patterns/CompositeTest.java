package com.bt.patterns;

import org.junit.Test;

import com.bt.bluetechnology.patterns.composite.Clip;
import com.bt.bluetechnology.patterns.composite.IWeapon;
import com.bt.bluetechnology.patterns.composite.LineBullet;
import com.bt.bluetechnology.patterns.composite.TraceBullet;

public class CompositeTest {

	@Test
	public void test() {
		IWeapon rootClip = new Clip();
		IWeapon childClip = new Clip();
		
		childClip.add(new TraceBullet());
		childClip.add(new TraceBullet());
		childClip.add(new TraceBullet());
		rootClip.add(new LineBullet());
		rootClip.add(childClip);
		rootClip.add(new LineBullet());
		rootClip.fire();
	}

}
