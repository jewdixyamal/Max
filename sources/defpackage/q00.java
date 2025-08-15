package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.mediabar.LocalPhotoView;
import ru.ok.messages.views.fragments.FrgProfilePhoto;
import ru.ok.tamtam.nano.Protos;

/* renamed from: q00  reason: default package */
public final class q00 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        WeakReference weakReference;
        View view;
        switch (this.a) {
            case 4:
                ap1 ap1 = (ap1) this.b;
                xo1 xo1 = ap1.b1;
                if (xo1 != null) {
                    xo1.y(ap1.h1);
                }
                return ap1.b1 != null;
            case 5:
                qz7 qz7 = ((j33) this.b).d;
                if (qz7 == null || (weakReference = (WeakReference) qz7.b) == null || (view = (View) weakReference.get()) == null) {
                    return false;
                }
                GestureDetector.OnDoubleTapListener onDoubleTapListener = view instanceof GestureDetector.OnDoubleTapListener ? (GestureDetector.OnDoubleTapListener) view : null;
                if (onDoubleTapListener != null) {
                    return onDoubleTapListener.onDoubleTap(motionEvent);
                }
                return false;
            case 6:
                jn jnVar = (jn) this.b;
                int i = jnVar.b;
                if (i == 0) {
                    int i2 = i + 1;
                    jnVar.b = i2;
                    wm4 wm4 = (wm4) jnVar.c;
                    if (wm4 != null) {
                        wm4.f(i2);
                    }
                }
                return true;
            case 8:
                cn4 cn4 = (cn4) this.b;
                int i3 = cn4.c;
                if (i3 == 0) {
                    int i4 = i3 + 1;
                    cn4.c = i4;
                    bn4 bn4 = cn4.a;
                    if (bn4 != null) {
                        bn4.f(i4);
                    }
                }
                return true;
            case 11:
                wa6 wa6 = (wa6) this.b;
                float currentScale = wa6.getCurrentScale() * ((float) Math.pow((double) (wa6.getMaxScale() / wa6.getMinScale()), (double) (1.0f / ((float) wa6.W0))));
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (currentScale > wa6.getMaxScale()) {
                    currentScale = wa6.getMaxScale();
                }
                float currentScale2 = wa6.getCurrentScale();
                s37 s37 = new s37(wa6, currentScale2, currentScale - currentScale2, x, y);
                wa6.K0 = s37;
                wa6.post(s37);
                return super.onDoubleTap(motionEvent);
            case 18:
                float x2 = motionEvent.getX();
                fag fag = (fag) this.b;
                fag.i = x2;
                fag.j = motionEvent.getY();
                fag.k = 1;
                return true;
            case 19:
                ((ZoomableDraweeView) this.b).E0.a(motionEvent.getX(), motionEvent.getY());
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                j33 j33 = (j33) this.b;
                j33.g = false;
                Spannable spannable = j33.e;
                if (spannable == null) {
                    return false;
                }
                j33.f = j33.a(j33, j33.d, spannable, motionEvent);
                return j33.f != null;
            case 9:
                return true;
            case 10:
                return true;
            case 13:
                sv8 sv8 = (sv8) this.b;
                Editable text = sv8.c.getText();
                if (text == null) {
                    return false;
                }
                jv8.a.onTouchEvent(sv8.c, text, motionEvent);
                return false;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return true;
            case LangUtils.HASH_SEED:
                float x = motionEvent.getX();
                ohf ohf = (ohf) this.b;
                float width = x - (((float) ohf.getWidth()) / 2.0f);
                float y = motionEvent.getY() - (((float) ohf.getHeight()) / 2.0f);
                if (ohf.i()) {
                    float width2 = ((float) ohf.getWidth()) / 2.0f;
                    float height = ((float) ohf.getHeight()) / 2.0f;
                    long e = ohf.e(width2, height);
                    if (((float) Math.hypot((double) ((width2 + width) - Float.intBitsToFloat((int) (e >> 32))), (double) ((height + y) - Float.intBitsToFloat((int) (e & 4294967295L))))) <= fk4.d().getDisplayMetrics().density * 12.0f * ((float) 2)) {
                        ohf.getParent().requestDisallowInterceptTouchEvent(true);
                        ohf.C0 = true;
                        ohf.l(width, y);
                        ohf.d(true);
                    }
                }
                return true;
            case 19:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLongPress(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            int r1 = r10.a
            switch(r1) {
                case 3: goto L_0x00cc;
                case 4: goto L_0x00b1;
                case 5: goto L_0x001d;
                case 17: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            super.onLongPress(r11)
            return
        L_0x000b:
            ohf r0 = (defpackage.ohf) r0
            boolean r10 = r0.C0
            if (r10 != 0) goto L_0x001c
            mhf r10 = r0.getListener()
            if (r10 == 0) goto L_0x001c
            dif r10 = (defpackage.dif) r10
            r10.performLongClick()
        L_0x001c:
            return
        L_0x001d:
            j33 r0 = (defpackage.j33) r0
            qz7 r10 = r0.d
            if (r10 != 0) goto L_0x0025
            goto L_0x00b0
        L_0x0025:
            android.text.Spannable r1 = r0.e
            if (r1 != 0) goto L_0x002b
            goto L_0x00b0
        L_0x002b:
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0033
            goto L_0x00b0
        L_0x0033:
            android.text.style.ClickableSpan r4 = defpackage.j33.a(r0, r10, r1, r11)
            boolean r10 = r4 instanceof android.text.style.URLSpan
            if (r10 == 0) goto L_0x0048
            lk7 r10 = defpackage.lk7.a
            r2 = r4
            android.text.style.URLSpan r2 = (android.text.style.URLSpan) r2
            java.lang.String r2 = r2.getURL()
            r0.c = r2
        L_0x0046:
            r8 = r10
            goto L_0x0091
        L_0x0048:
            boolean r10 = r4 instanceof defpackage.ek7
            if (r10 == 0) goto L_0x0056
            lk7 r10 = defpackage.lk7.Y
            r2 = r4
            ek7 r2 = (defpackage.ek7) r2
            java.lang.String r2 = r2.b
            r0.c = r2
            goto L_0x0046
        L_0x0056:
            boolean r10 = r4 instanceof defpackage.qu8
            if (r10 == 0) goto L_0x0083
            r10 = r4
            qu8 r10 = (defpackage.qu8) r10
            nu8 r10 = r10.a
            mu8 r2 = r10.c
            mu8 r3 = defpackage.mu8.a
            if (r2 != r3) goto L_0x00b0
            lk7 r2 = defpackage.lk7.X
            int r10 = r10.e
            r10 = r4
            qu8 r10 = (defpackage.qu8) r10     // Catch:{ all -> 0x00b0 }
            nu8 r10 = r10.a     // Catch:{ all -> 0x00b0 }
            int r10 = r10.d     // Catch:{ all -> 0x00b0 }
            r3 = r4
            qu8 r3 = (defpackage.qu8) r3     // Catch:{ all -> 0x00b0 }
            nu8 r3 = r3.a     // Catch:{ all -> 0x00b0 }
            int r3 = r3.e     // Catch:{ all -> 0x00b0 }
            java.lang.CharSequence r10 = r1.subSequence(r10, r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00b0 }
            r0.c = r10     // Catch:{ all -> 0x00b0 }
            r8 = r2
            goto L_0x0091
        L_0x0083:
            boolean r10 = r4 instanceof defpackage.cmb
            if (r10 == 0) goto L_0x00b0
            lk7 r10 = defpackage.lk7.X
            r2 = r4
            cmb r2 = (defpackage.cmb) r2
            java.lang.String r2 = r2.a
            r0.c = r2
            goto L_0x0046
        L_0x0091:
            r0.f = r4
            java.lang.String r7 = r0.c
            if (r7 != 0) goto L_0x0098
            goto L_0x00b0
        L_0x0098:
            int r10 = r7.length()
            if (r10 != 0) goto L_0x009f
            goto L_0x00b0
        L_0x009f:
            int r5 = r1.getSpanStart(r4)
            int r6 = r1.getSpanEnd(r4)
            i33 r3 = r0.a
            r9 = r11
            r3.d(r4, r5, r6, r7, r8, r9)
            r10 = 1
            r0.g = r10
        L_0x00b0:
            return
        L_0x00b1:
            ap1 r0 = (defpackage.ap1) r0
            xo1 r10 = r0.b1
            if (r10 == 0) goto L_0x00cb
            gg1 r0 = r0.h1
            android.graphics.Point r1 = new android.graphics.Point
            float r2 = r11.getRawX()
            int r2 = (int) r2
            float r11 = r11.getRawY()
            int r11 = (int) r11
            r1.<init>(r2, r11)
            r10.v(r0, r1)
        L_0x00cb:
            return
        L_0x00cc:
            no1 r0 = (defpackage.no1) r0
            lo1 r10 = r0.f1
            if (r10 == 0) goto L_0x00f0
            gg1 r0 = r0.i1
            android.graphics.Point r1 = new android.graphics.Point
            float r2 = r11.getX()
            int r2 = (int) r2
            float r11 = r11.getY()
            int r11 = (int) r11
            r1.<init>(r2, r11)
            ui1 r10 = (defpackage.ui1) r10
            yxc r11 = one.me.calls.ui.ui.call.CallScreen.R0
            one.me.calls.ui.ui.call.CallScreen r10 = r10.a
            el1 r10 = r10.D0()
            r10.x(r0, r1)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q00.onLongPress(android.view.MotionEvent):void");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 11:
                ((wa6) this.b).g(-f, -f2);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        r00 r00;
        g71 g71;
        k56 k56;
        WeakReference weakReference;
        wm4 wm4;
        bn4 bn4;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                AttachPhotoView attachPhotoView = (AttachPhotoView) obj;
                if (!attachPhotoView.J0.e(attachPhotoView.getMeasuredWidth() / 2, attachPhotoView.getMeasuredHeight() / 2, motionEvent) && (r00 = attachPhotoView.I0) != null) {
                    ((FrgAttachPhoto) r00).E1(attachPhotoView.Q0);
                }
                return true;
            case 2:
                m71 m71 = (m71) obj;
                l71 l71 = m71.J0;
                if (!(l71 == null || (g71 = ((h71) ((qqd) l71).b).O0) == null)) {
                    yxc yxc = CallScreen.R0;
                    CallScreen callScreen = ((ki1) g71).a;
                    if (callScreen.D0().q(callScreen.z0().g)) {
                        CallScreen.q0(callScreen);
                    }
                }
                return m71.J0 != null;
            case 3:
                no1 no1 = (no1) obj;
                lo1 lo1 = no1.f1;
                if (lo1 != null) {
                    yxc yxc2 = CallScreen.R0;
                    CallScreen callScreen2 = ((ui1) lo1).a;
                    if (callScreen2.D0().q(callScreen2.z0().g)) {
                        CallScreen.q0(callScreen2);
                    }
                }
                return no1.f1 != null;
            case 4:
                ap1 ap1 = (ap1) obj;
                xo1 xo1 = ap1.b1;
                if (xo1 != null) {
                    xo1.H(ap1.h1);
                }
                return ap1.b1 != null;
            case 5:
                j33 j33 = (j33) obj;
                qz7 qz7 = j33.d;
                View view = (qz7 == null || (weakReference = (WeakReference) qz7.b) == null) ? null : (View) weakReference.get();
                ClickableSpan clickableSpan = j33.f;
                if (clickableSpan == null || view == null) {
                    j33.g = false;
                    if (!(clickableSpan != null || view == null || (k56 = j33.h) == null)) {
                        if (k56 != null) {
                            k56.invoke();
                        }
                        j33.d = null;
                    }
                } else {
                    if (!j33.g) {
                        clickableSpan.onClick(view);
                    }
                    j33.d = null;
                    j33.f = null;
                    j33.e = null;
                    j33.c = null;
                    j33.g = false;
                }
                return true;
            case 6:
                jn jnVar = (jn) obj;
                if (jnVar.b == 0 && (wm4 = (wm4) jnVar.c) != null) {
                    wm4.b();
                }
                return true;
            case 7:
                u5e u5e = (u5e) ((zm4) obj).e;
                u5e.getClass();
                bc7[] bc7Arr = VideoViewerWidget.u0;
                dmf o0 = ((VideoViewerWidget) u5e.a).o0();
                if (o0 != null) {
                    ((ChatMediaViewerScreen) o0).G0(true);
                }
                return super.onSingleTapConfirmed(motionEvent);
            case 8:
                cn4 cn4 = (cn4) obj;
                if (cn4.c == 0 && (bn4 = cn4.a) != null) {
                    bn4.b();
                }
                return true;
            case 9:
                FrgContactAvatar frgContactAvatar = (FrgContactAvatar) obj;
                if (frgContactAvatar.I1) {
                    frgContactAvatar.I1 = false;
                } else if (frgContactAvatar.r1() != null) {
                    frgContactAvatar.r1().e();
                }
                return true;
            case 10:
                FrgProfilePhoto frgProfilePhoto = (FrgProfilePhoto) obj;
                if (frgProfilePhoto.r1() != null) {
                    frgProfilePhoto.r1().e();
                }
                return true;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                int i = LocalPhotoView.I0;
                hm9.k("ru.ok.messages.media.mediabar.LocalPhotoView", "onSingleTapConfirmed");
                rq7 rq7 = ((LocalPhotoView) obj).H0;
                if (rq7 != null) {
                    rq7.b();
                }
                return true;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                wk9 wk9 = ((oj9) obj).u0;
                if (wk9 != null) {
                    wk9.n(new fj0(18));
                }
                return super.onSingleTapConfirmed(motionEvent);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                hwa hwa = ((iwa) obj).I0;
                if (hwa != null) {
                    hwa.f();
                }
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        b17 b17;
        Object obj = this.b;
        switch (this.a) {
            case 1:
                qv0 qv0 = (qv0) obj;
                ov0 ov0 = qv0.C0;
                fv0 fv0 = qv0.D0;
                kv0 kv0 = qv0.E0;
                if (!(ov0 == null || fv0 == null || kv0 == null || fv0.s0)) {
                    c17 c17 = (c17) ov0;
                    p44 p44 = c17.u0;
                    p44.getClass();
                    if (p44.b) {
                        p44.b = false;
                        z07 z07 = c17.o;
                        if (!(z07 == null || (b17 = c17.t0) == null)) {
                            long j = c17.c;
                            bc7[] bc7Arr = MessagesListWidget.X0;
                            n59 x0 = ((MessagesListWidget) ((yt8) b17).b).x0();
                            vxd S = j47.S(x0.a, ((w9a) x0.Y).b(), vx3.b, new x39(fv0, x0, j, z07, kv0, (Continuation) null));
                            x0.m1.o1(x0, n59.D1[4], S);
                        }
                        c17.postDelayed(new re(12, (es3) p44.c), p44.a);
                    }
                }
                qv0.D0 = null;
                qv0.E0 = null;
                qv0.invalidate();
                return true;
            case 5:
                j33 j33 = (j33) obj;
                if (!j33.i) {
                    onSingleTapConfirmed(motionEvent);
                } else {
                    Runnable runnable = j33.j;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                return false;
            case 6:
                jn jnVar = (jn) obj;
                int i = jnVar.b;
                if (i > 0) {
                    int i2 = i + 1;
                    jnVar.b = i2;
                    wm4 wm4 = (wm4) jnVar.c;
                    if (wm4 != null) {
                        wm4.f(i2);
                    }
                }
                return true;
            case 8:
                cn4 cn4 = (cn4) obj;
                int i3 = cn4.c;
                if (i3 > 0) {
                    int i4 = i3 + 1;
                    cn4.c = i4;
                    bn4 bn4 = cn4.a;
                    if (bn4 != null) {
                        bn4.f(i4);
                    }
                }
                return true;
            case 13:
                sv8 sv8 = (sv8) obj;
                Editable text = sv8.c.getText();
                if (text != null) {
                    jv8.a.onTouchEvent(sv8.c, text, motionEvent);
                }
                return false;
            case 16:
                ufd ufd = (ufd) obj;
                if (!ufd.P0.a() || ((tja) ufd.P0.getValue()).isEnabled()) {
                    return false;
                }
                qfd qfd = ufd.S0;
                if (qfd != null) {
                    qfd.B(ufd.getModelItem().getItemId());
                }
                return true;
            case LangUtils.HASH_SEED:
                ohf ohf = (ohf) obj;
                if (!ohf.i()) {
                    mhf listener = ohf.getListener();
                    if (listener != null) {
                        ((dif) listener).t();
                    }
                    ohf.setInPause(true);
                } else if (ohf.i()) {
                    mhf listener2 = ohf.getListener();
                    if (listener2 != null) {
                        ((dif) listener2).v();
                    }
                    ohf.setInPause(false);
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
