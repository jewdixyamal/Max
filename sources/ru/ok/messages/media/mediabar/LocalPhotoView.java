package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import one.me.sdk.zoom.ZoomableDraweeView;

public class LocalPhotoView extends ZoomableDraweeView {
    public static final /* synthetic */ int I0 = 0;
    public final GestureDetector G0;
    public rq7 H0;

    public LocalPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(12, this));
        this.G0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        ma6 ma6 = new ma6(getResources());
        ma6.l = ssc.o;
        ma6.b = 0;
        setHierarchy(ma6.a());
    }

    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.G0.onTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setListener(rq7 rq7) {
        this.H0 = rq7;
    }
}
