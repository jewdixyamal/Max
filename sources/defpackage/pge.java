package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: pge  reason: default package */
public final class pge extends FrameLayout implements wge {
    public final /* synthetic */ xge a = new Object();

    /* JADX WARNING: type inference failed for: r1v1, types: [xge, java.lang.Object] */
    public pge(Context context) {
        super(context);
    }

    public final void a() {
        this.a.a();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public k56 getOnRequestInterceptTouchEvent() {
        return this.a.b;
    }

    public m56 getOnTouch() {
        return this.a.a;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m56 onTouch = this.a.getOnTouch();
        return (onTouch != null ? ((Boolean) onTouch.invoke(motionEvent)).booleanValue() : false) || Boolean.valueOf(super.onInterceptTouchEvent(motionEvent)).booleanValue();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m56 onTouch = this.a.getOnTouch();
        return (onTouch != null ? ((Boolean) onTouch.invoke(motionEvent)).booleanValue() : false) || Boolean.valueOf(super.onTouchEvent(motionEvent)).booleanValue();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        a();
    }

    public void setOnRequestInterceptTouchEvent(k56 k56) {
        this.a.b = k56;
    }

    public void setOnTouch(m56 m56) {
        this.a.a = m56;
    }
}
