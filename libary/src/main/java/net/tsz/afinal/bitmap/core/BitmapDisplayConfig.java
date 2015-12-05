/**
 * Copyright (c) 2012-2013, Michael Yang 杨福海 (www.yangfuhai.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tsz.afinal.bitmap.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.animation.Animation;
import android.widget.ImageView;

public class BitmapDisplayConfig {

	private int bitmapWidth;
	private int bitmapHeight;

	private Animation animation;

	private int animationType;
	private Bitmap loadingBitmap;
	private Bitmap loadfailBitmap;
	private boolean loading;
	private int loadingColor = Color.BLUE & 0x00FFFFFF | 0x88001100;
	private float loadingRadius = 0;

	public int getBitmapWidth() {
		return bitmapWidth;
	}

	public void setBitmapWidth(int bitmapWidth) {
		this.bitmapWidth = bitmapWidth;
	}

	public int getBitmapHeight() {
		return bitmapHeight;
	}

	public void setBitmapHeight(int bitmapHeight) {
		this.bitmapHeight = bitmapHeight;
	}

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	public int getAnimationType() {
		return animationType;
	}

	public void setAnimationType(int animationType) {
		this.animationType = animationType;
	}

	public Bitmap getLoadingBitmap() {
		return loadingBitmap;
	}

	public void setLoadingBitmap(Bitmap loadingBitmap) {
		this.loadingBitmap = loadingBitmap;
	}

	public Bitmap getLoadfailBitmap() {
		return loadfailBitmap;
	}

	public void setLoadfailBitmap(Bitmap loadfailBitmap) {
		this.loadfailBitmap = loadfailBitmap;
	}

	public boolean getLoading() {
		return loading;
	}

	public void setLoading(boolean loading) {
		this.loading = loading;
	}

	public int getLoadingColor() {
		return loadingColor;
	}

	public void setLoadingColor(int color) {
		this.loadingColor = color;
	}

	public float getLoadingRadius() {
		return loadingRadius;
	}

	public void setLoadingRadius(float loadingRadius) {
		this.loadingRadius = loadingRadius;
	}

	public class AnimationType {
		public static final int userDefined = 0;
		public static final int fadeIn = 1;
	}

	public void setOnSetListener(OnSetListener l) {
		mOnSetListener = l;
	}

	public void onSet(ImageView imageView, String url) {
		if (mOnSetListener != null) {
			mOnSetListener.onSet(imageView, url);
		}
	}

	private OnSetListener mOnSetListener;

	public interface OnSetListener {
		public void onSet(ImageView imageView, String url);
	}
}
