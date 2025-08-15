package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import one.me.profile.screens.avatars.ProfileAvatarWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* renamed from: p63  reason: default package */
public final class p63 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p63(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public boolean a(MotionEvent motionEvent) {
        ht8 ht8 = (ht8) this.c;
        View view = ht8.I0;
        if (!(view instanceof jw8) || view.getTouchDelegate() == null) {
            return false;
        }
        return ht8.I0.getTouchDelegate().onTouchEvent(motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (!a(motionEvent)) {
                    View view = ((ht8) this.c).I0;
                    ot8 ot8 = view instanceof ot8 ? (ot8) view : null;
                    if (ot8 != null) {
                        ot8.d(motionEvent, ht8.R0);
                    }
                }
                return true;
            case 2:
                return true;
            case 4:
                xkd xkd = (xkd) this.b;
                TouchDelegate touchDelegate = xkd.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false) && xkd.v0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    xkd.getRippleDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    xkd.getBorderDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    xkd.setPressed(true);
                    xkd.invalidate();
                }
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (!a(motionEvent)) {
                    ((zs8) ((ht8) this.c).a).performLongClick();
                    return;
                }
                return;
            case 2:
                super.onLongPress(motionEvent);
                ((k56) this.c).invoke();
                return;
            case 4:
                xkd xkd = (xkd) this.b;
                TouchDelegate touchDelegate = xkd.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    xkd.setPressed(false);
                    xkd.invalidate();
                    xkd.performLongClick();
                    return;
                }
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                wab wab = (wab) this.b;
                if (wab != null) {
                    bc7[] bc7Arr = ProfileAvatarWidget.X;
                    ProfileAvatarWidget profileAvatarWidget = (ProfileAvatarWidget) this.c;
                    profileAvatarWidget.getClass();
                    boolean z = false;
                    bc7 bc7 = ProfileAvatarWidget.X[0];
                    ((Number) profileAvatarWidget.b.a(profileAvatarWidget)).longValue();
                    ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) wab;
                    if (profileAvatarsScreen.A0().getVisibility() == 0) {
                        z = true;
                    }
                    profileAvatarsScreen.z0(!z);
                }
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        a53 n;
        switch (this.a) {
            case 0:
                o63 o63 = (o63) this.b;
                if (o63 == null) {
                    return true;
                }
                ((ewa) o63).c(((n63) this.c).getColor());
                return true;
            case 1:
                if (!a(motionEvent)) {
                    ht8 ht8 = (ht8) this.c;
                    View view = ht8.I0;
                    String str = null;
                    ot8 ot8 = view instanceof ot8 ? (ot8) view : null;
                    if (!(ot8 == null || (n = ot8.n(motionEvent)) == null)) {
                        str = n.i();
                    }
                    if (ot8 != null) {
                        ot8.d(motionEvent, ht8.S0);
                    }
                    if (ot8 == null || (!ot8.h(motionEvent) && str == null)) {
                        ((zs8) ht8.a).performClick();
                    } else {
                        ((m56) this.b).invoke(str);
                    }
                }
                return true;
            case 2:
                ((k56) this.b).invoke();
                return true;
            case 4:
                xkd xkd = (xkd) this.b;
                TouchDelegate touchDelegate = xkd.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    xkd.setPressed(false);
                    xkd.invalidate();
                    if (xkd.v0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ((k56) this.c).invoke();
                    } else {
                        ((View) xkd.getParent()).performClick();
                    }
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }

    public p63(ht8 ht8, ft8 ft8) {
        this.a = 1;
        this.c = ht8;
        this.b = ft8;
    }
}
