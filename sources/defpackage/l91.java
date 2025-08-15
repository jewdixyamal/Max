package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: l91  reason: default package */
public final class l91 implements um1 {
    public final je7 X;
    public final je7 Y = tu0.r(3, new k11(13));
    public Activity Z;
    public final kr1 a;
    public final nb5 b;
    public final z01 c;
    public final os1 o;
    public final je7 s0;
    public final je7 t0;
    public Drawable u0;
    public boolean v0;
    public final je7 w0;
    public final je7 x0;
    public final ru3 y0;

    public l91(kr1 kr1, nb5 nb5, z01 z01, os1 os1, je7 je7, je7 je72) {
        this.a = kr1;
        this.b = nb5;
        this.c = z01;
        this.o = os1;
        this.X = je72;
        this.s0 = je7;
        je7 r = tu0.r(3, new k11(14));
        this.t0 = r;
        this.u0 = (ColorDrawable) r.getValue();
        this.w0 = tu0.r(3, new f91(this, 0));
        this.x0 = tu0.r(3, new f91(this, 1));
        this.y0 = new ru3(2, (Object) this);
    }

    public static znc c() {
        return y8a.a.o().f().C();
    }

    public static void e(l91 l91) {
        l91.v0 = false;
        ((cb5) l91.b).c(50);
        l91.y0.f(false);
    }

    public final boolean b() {
        return ((wr1) this.a).p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PictureInPictureParams d() {
        /*
            r9 = this;
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            kl7 r1 = defpackage.j1e.l()
            z01 r2 = r9.c
            r3 = r2
            a11 r3 = (defpackage.a11) r3
            boolean r3 = r3.d()
            java.lang.Class<ya1> r4 = defpackage.ya1.class
            r5 = 0
            java.lang.String r6 = "Required value was null."
            if (r3 == 0) goto L_0x005a
            android.app.Activity r9 = r9.Z
            if (r9 == 0) goto L_0x0054
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r3 = defpackage.x7a.g0
            android.graphics.drawable.Icon r3 = android.graphics.drawable.Icon.createWithResource(r9, r3)
            int r7 = defpackage.b8a.i0
            java.lang.String r8 = r9.getString(r7)
            java.lang.String r9 = r9.getString(r7)
            y8a r7 = defpackage.y8a.a
            v4 r7 = r7.getAccessor()
            java.lang.Object r4 = r7.c(r4)
            ya1 r4 = (defpackage.ya1) r4
            a11 r2 = (defpackage.a11) r2
            r2.d()
            android.app.PendingIntent r2 = r4.d()
            if (r2 == 0) goto L_0x004a
            r5.<init>(r3, r8, r9, r2)
            goto L_0x0054
        L_0x004a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.toString()
            r9.<init>(r0)
            throw r9
        L_0x0054:
            if (r5 == 0) goto L_0x0098
        L_0x0056:
            r1.add(r5)
            goto L_0x0098
        L_0x005a:
            android.app.Activity r9 = r9.Z
            if (r9 == 0) goto L_0x0095
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r3 = defpackage.x7a.h0
            android.graphics.drawable.Icon r3 = android.graphics.drawable.Icon.createWithResource(r9, r3)
            int r7 = defpackage.b8a.h0
            java.lang.String r8 = r9.getString(r7)
            java.lang.String r9 = r9.getString(r7)
            y8a r7 = defpackage.y8a.a
            v4 r7 = r7.getAccessor()
            java.lang.Object r4 = r7.c(r4)
            ya1 r4 = (defpackage.ya1) r4
            a11 r2 = (defpackage.a11) r2
            r2.d()
            android.app.PendingIntent r2 = r4.d()
            if (r2 == 0) goto L_0x008b
            r5.<init>(r3, r8, r9, r2)
            goto L_0x0095
        L_0x008b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.toString()
            r9.<init>(r0)
            throw r9
        L_0x0095:
            if (r5 == 0) goto L_0x0098
            goto L_0x0056
        L_0x0098:
            kl7 r9 = defpackage.j1e.d(r1)
            android.app.PictureInPictureParams$Builder r9 = r0.setActions(r9)
            java.lang.String r0 = "2:3"
            android.util.Rational r0 = android.util.Rational.parseRational(r0)
            android.app.PictureInPictureParams$Builder r9 = r9.setAspectRatio(r0)
            android.app.PictureInPictureParams r9 = r9.build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l91.d():android.app.PictureInPictureParams");
    }

    public final void f(boolean z) {
        Activity activity = this.Z;
        if (activity != null) {
            boolean B = y8a.a.o().f().B(z);
            hm9.m("PipAppController", "try to hide call indicator hasCall=" + b(), new Object[0]);
            if (B) {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                boolean z2 = false;
                View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                if (childAt != null && qp4.u0.b(childAt.getContext()).j()) {
                    z2 = true;
                }
                dy7.j(activity, z2);
            }
        }
    }

    public final void g(boolean z) {
        Activity activity = this.Z;
        if (activity != null) {
            boolean b2 = b();
            coc coc = (coc) x53.q0(c().e());
            uu3 uu3 = coc != null ? coc.a : null;
            boolean z2 = !((uu3 instanceof iq9) || uu3 == null);
            hm9.m("PipAppController", "try to show call indicator hasCall=" + b2 + " canShow=" + z2 + ".", new Object[0]);
            if (z2 && b2 && y8a.a.o().f().b(new CallIndicatorWidget(), z)) {
                dy7.j(activity, true);
            }
            if (!b2) {
                hm9.m("PipAppController", "can't show indicator due to call is absent, try to force close indicator.", new Object[0]);
                f(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r8 = this;
            android.app.Activity r0 = r8.Z
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r1 = "keyguard"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1
            boolean r1 = r1.isDeviceLocked()
            java.lang.String r2 = "PipAppController"
            if (r1 == 0) goto L_0x001b
            java.lang.String r8 = "can't show global pip due to device is locked"
            defpackage.hm9.m(r2, r8, new java.lang.Object[0])
            return
        L_0x001b:
            android.app.Activity r1 = r8.Z
            r3 = 0
            if (r1 != 0) goto L_0x0022
            r1 = r3
            goto L_0x002c
        L_0x0022:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r4 = "android.software.picture_in_picture"
            boolean r1 = r1.hasSystemFeature(r4)
        L_0x002c:
            if (r1 != 0) goto L_0x0034
            java.lang.String r8 = "pip mode doesn't supported on current device"
            defpackage.hm9.m(r2, r8, new java.lang.Object[0])
            return
        L_0x0034:
            android.app.Activity r1 = r8.Z
            r4 = 1
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            r1 = r3
            goto L_0x005b
        L_0x003b:
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            java.lang.Object r5 = r1.getSystemService(r5)     // Catch:{ SecurityException -> 0x0055 }
            android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r6 = "android:picture_in_picture"
            int r7 = android.os.Process.myUid()     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ SecurityException -> 0x0055 }
            int r1 = r5.unsafeCheckOp(r6, r7, r1)     // Catch:{ SecurityException -> 0x0055 }
            if (r1 != 0) goto L_0x0039
            r1 = r4
            goto L_0x005b
        L_0x0055:
            java.lang.String r1 = "Can't check pip permission state in settings."
            defpackage.hm9.m(r2, r1, new java.lang.Object[0])
            goto L_0x0039
        L_0x005b:
            if (r1 != 0) goto L_0x0063
            java.lang.String r8 = "doesn't have PIP permission."
            defpackage.hm9.m(r2, r8, new java.lang.Object[0])
            return
        L_0x0063:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            java.util.List r5 = r1.getAppTasks()
            int r5 = r5.size()
            if (r5 != r4) goto L_0x0089
            java.util.List r1 = r1.getAppTasks()
            java.lang.Object r1 = defpackage.x53.g0(r1)
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            int r1 = r1.numActivities
            if (r1 != r4) goto L_0x0089
            r1 = r4
            goto L_0x008a
        L_0x0089:
            r1 = r3
        L_0x008a:
            znc r5 = c()
            java.util.ArrayList r5 = r5.e()
            java.lang.Object r5 = defpackage.x53.q0(r5)
            coc r5 = (defpackage.coc) r5
            r6 = 0
            if (r5 == 0) goto L_0x009e
            uu3 r5 = r5.a
            goto L_0x009f
        L_0x009e:
            r5 = r6
        L_0x009f:
            boolean r7 = r5 instanceof defpackage.iq9
            if (r7 != 0) goto L_0x00a8
            if (r5 != 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r5 = r3
            goto L_0x00a9
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            kr1 r7 = r8.a
            if (r5 == 0) goto L_0x00c7
            je7 r5 = r8.Y
            java.lang.Object r5 = r5.getValue()
            xj1 r5 = (defpackage.xj1) r5
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x00c5
            r5 = r7
            wr1 r5 = (defpackage.wr1) r5
            boolean r5 = r5.q()
            if (r5 == 0) goto L_0x00c5
            r3 = r4
        L_0x00c5:
            r8.v0 = r3
        L_0x00c7:
            if (r1 == 0) goto L_0x0136
            boolean r3 = r8.v0
            if (r3 == 0) goto L_0x0136
            java.lang.String r1 = "start show global pip"
            defpackage.hm9.m(r2, r1, new java.lang.Object[0])
            r8.i(r4)
            znc r1 = c()
            java.util.ArrayList r1 = r1.e()
            java.lang.Object r1 = defpackage.x53.q0(r1)
            coc r1 = (defpackage.coc) r1
            if (r1 == 0) goto L_0x00f4
            uu3 r1 = r1.a
            if (r1 == 0) goto L_0x00f4
            uu3 r1 = r1.getParentController()
            if (r1 == 0) goto L_0x00f4
            znc r1 = r1.getRouter()
            goto L_0x00f5
        L_0x00f4:
            r1 = r6
        L_0x00f5:
            if (r1 == 0) goto L_0x0106
            java.util.ArrayList r1 = r1.e()
            java.lang.Object r1 = defpackage.x53.q0(r1)
            coc r1 = (defpackage.coc) r1
            if (r1 == 0) goto L_0x0106
            uu3 r1 = r1.a
            goto L_0x0107
        L_0x0106:
            r1 = r6
        L_0x0107:
            boolean r3 = r1 instanceof one.me.sdk.bottomsheet.BottomSheetWidget
            if (r3 == 0) goto L_0x010e
            one.me.sdk.bottomsheet.BottomSheetWidget r1 = (one.me.sdk.bottomsheet.BottomSheetWidget) r1
            goto L_0x010f
        L_0x010e:
            r1 = r6
        L_0x010f:
            if (r1 == 0) goto L_0x0119
            java.lang.String r3 = "hide last bottom sheet dialog before pip mode"
            defpackage.hm9.m(r2, r3, new java.lang.Object[0])
            r1.s0(r4)
        L_0x0119:
            znc r1 = c()
            java.lang.String r2 = ":call-pip"
            uu3 r1 = r1.g(r2)
            if (r1 != 0) goto L_0x012e
            vw7 r1 = defpackage.vw7.c
            f64 r1 = r1.P1()
            r1.b(r2, r6)
        L_0x012e:
            android.app.PictureInPictureParams r8 = r8.d()
            r0.enterPictureInPictureMode(r8)
            goto L_0x015f
        L_0x0136:
            boolean r8 = r8.v0
            wr1 r7 = (defpackage.wr1) r7
            boolean r0 = r7.q()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "can't show global pip isMainTask="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " isPipAvailable="
            r3.append(r1)
            r3.append(r8)
            java.lang.String r8 = " isCallAvailable="
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            defpackage.hm9.m0(r2, r8, new java.lang.Object[0])
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l91.h():void");
    }

    public final void i(boolean z) {
        Activity activity = this.Z;
        if (activity != null) {
            if (z) {
                this.u0 = activity.getWindow().getDecorView().getBackground();
                activity.getWindow().setBackgroundDrawable((ColorDrawable) this.t0.getValue());
                return;
            }
            activity.getWindow().setBackgroundDrawable(this.u0);
        }
    }

    public final void j() {
        Activity activity = this.Z;
        if (activity != null) {
            coc coc = (coc) x53.q0(c().e());
            zvc zvc = null;
            boolean z = (coc != null ? coc.a : null) instanceof iq9;
            coc coc2 = (coc) x53.q0(c().e());
            uu3 uu3 = coc2 != null ? coc2.a : null;
            if (uu3 instanceof zvc) {
                zvc = (zvc) uu3;
            }
            boolean z2 = zvc != null && zvc.P();
            if (z) {
                dy7.j(activity, true);
                dy7.i(activity, true);
            } else if (!z && !b() && !z2) {
                dy7.j(activity, false);
                dy7.i(activity, false);
            } else if (b()) {
                dy7.j(activity, true);
                dy7.i(activity, false);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [a66, ffe] */
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        this.y0.f(false);
        ConversationEndReason reason = conversationDestroyedInfo.getReason();
        if ((reason instanceof ConversationEndReason.Hangup) || (reason instanceof ConversationEndReason.EndedForAll)) {
            Object unused = j47.f0(hz4.a, new ffe(2, (Continuation) null));
        }
    }

    public final void onParticipantsChanged(List list) {
        Activity activity = this.Z;
        if (activity != null) {
            if (activity != null ? activity.isInPictureInPictureMode() : false) {
                activity.setPictureInPictureParams(d());
            }
        }
    }
}
