package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: y98  reason: default package */
public final /* synthetic */ class y98 implements km7, fa8, ri8, pj3, rj8, i33, qj3, w5c, grd, pv6, o1d, y2a, mq1, b66, fu3, s0a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y98(zn5 zn5) {
        this.a = 29;
        this.b = hz4.a;
        this.c = zn5;
    }

    public x6g P(View view, x6g x6g) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = vc7.a;
            boolean b2 = vc7.b(vc7.c);
            i50 i50 = (i50) this.b;
            Context context = (Context) this.c;
            if (b2) {
                int a2 = vc7.a(context);
                int i2 = marginLayoutParams.bottomMargin;
                if (i2 < a2) {
                    marginLayoutParams.bottomMargin = i2 + a2;
                }
                z = true;
            } else {
                if (!i50.b || marginLayoutParams.bottomMargin < vc7.a(context)) {
                    marginLayoutParams.bottomMargin = Math.max(marginLayoutParams.bottomMargin, x6g.a.f(7).d);
                } else {
                    marginLayoutParams.bottomMargin -= vc7.a(context);
                }
                z = false;
            }
            i50.b = z;
            view.setLayoutParams(marginLayoutParams);
            return x6g;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                x4b x4b = (x4b) obj;
                sj8 sj8 = (sj8) this.b;
                sj8.getClass();
                j0f j0f = (j0f) this.c;
                if (!j0f.A.isEmpty()) {
                    h0f c2 = j0f.a().c();
                    m5f g = j0f.A.values().iterator();
                    while (g.hasNext()) {
                        c0f c0f = (c0f) g.next();
                        rze rze = (rze) sj8.g.t0.get(c0f.a.b);
                        if (rze == null || c0f.a.a != rze.a) {
                            c2.a(c0f);
                        } else {
                            c2.a(new c0f(rze, c0f.b));
                        }
                    }
                    j0f = c2.b();
                }
                x4b.Q(j0f);
                return;
            case 6:
                x4b x4b2 = (x4b) obj;
                ii8 ii8 = (ii8) ((sj8) this.b).c.get();
                if (ii8 != null && !ii8.i()) {
                    ii8.g((oh8) this.c, false);
                    return;
                }
                return;
            case 10:
                tpa.K((m20) obj, (String) this.b, (qj3) this.c);
                return;
            case 11:
                tpa.L((j10) obj, (d20) this.c, ((p7b) ((au8) this.b).c).a.n());
                return;
            case 13:
                tpa.K((m20) obj, (String) this.b, new wp(4, (m56) this.c));
                return;
            default:
                ((ActLocalMedias) ((zj9) this.b).c).s0((Uri) obj, (File) this.c, (nz3) null);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 26:
                ((p9c) this.b).getClass();
                return p9c.d((d9c) obj, (h9c) this.c);
            default:
                ((p9c) this.b).getClass();
                return p9c.d((d9c) this.c, (h9c) obj);
        }
    }

    public void b(oh8 oh8) {
        switch (this.a) {
            case 3:
                Bundle bundle = (Bundle) this.c;
                si8 si8 = (si8) this.b;
                if (bundle == null) {
                    si8.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                }
                si8.f.m(oh8);
                return;
            default:
                si8 si82 = (si8) this.b;
                si82.getClass();
                String str = ((ja8) this.c).a;
                if (TextUtils.isEmpty(str)) {
                    z04.c0("onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                x4b x4b = si82.f.s;
                if (!x4b.t1(17)) {
                    z04.c0("Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                mue x0 = x4b.x0();
                kue kue = new kue();
                for (int i = 0; i < x0.p(); i++) {
                    if (TextUtils.equals(x0.n(i, kue, 0).c.a, str)) {
                        x4b.S(i);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: m4b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(defpackage.w98 r11) {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 1: goto L_0x0082;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto L_0x000d
            goto L_0x0081
        L_0x000d:
            k3b r0 = r11.r
            java.lang.Object r1 = r10.c
            k3b r1 = (defpackage.k3b) r1
            boolean r0 = defpackage.oaf.a(r0, r1)
            r0 = r0 ^ 1
            z9d r2 = r11.q
            java.lang.Object r10 = r10.b
            z9d r10 = (defpackage.z9d) r10
            boolean r2 = defpackage.oaf.a(r2, r10)
            r2 = r2 ^ 1
            if (r0 != 0) goto L_0x002a
            if (r2 != 0) goto L_0x002a
            goto L_0x0081
        L_0x002a:
            r11.q = r10
            r3 = 0
            if (r0 == 0) goto L_0x0042
            r11.r = r1
            k3b r0 = r11.t
            k3b r4 = r11.s
            k3b r1 = defpackage.w98.i(r1, r4)
            r11.t = r1
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            goto L_0x0043
        L_0x0042:
            r0 = r3
        L_0x0043:
            if (r2 != 0) goto L_0x0047
            if (r0 == 0) goto L_0x0059
        L_0x0047:
            ffc r1 = r11.p
            zw6 r3 = r11.o
            k3b r4 = r11.t
            ffc r3 = defpackage.c73.a(r3, r10, r4)
            r11.p = r3
            boolean r1 = r3.equals(r1)
            r3 = r1 ^ 1
        L_0x0059:
            if (r0 == 0) goto L_0x0069
            k98 r0 = new k98
            r1 = 16
            r0.<init>((defpackage.w98) r11, (int) r1)
            pm7 r1 = r11.h
            r4 = 13
            r1.f(r4, r0)
        L_0x0069:
            a98 r0 = r11.a
            if (r2 == 0) goto L_0x0075
            k98 r1 = new k98
            r1.<init>((defpackage.w98) r11, (defpackage.z9d) r10)
            r0.o(r1)
        L_0x0075:
            if (r3 == 0) goto L_0x0081
            k98 r10 = new k98
            r1 = 18
            r10.<init>((defpackage.w98) r11, (int) r1)
            r0.o(r10)
        L_0x0081:
            return
        L_0x0082:
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto L_0x008a
            goto L_0x012d
        L_0x008a:
            m4b r0 = r11.z
            java.lang.Object r1 = r10.b
            m4b r1 = (defpackage.m4b) r1
            java.lang.Object r10 = r10.c
            k4b r10 = (defpackage.k4b) r10
            if (r0 == 0) goto L_0x00a9
            k4b r2 = r11.A
            if (r2 == 0) goto L_0x00a9
            k3b r3 = r11.t
            android.util.Pair r10 = defpackage.j47.Y(r0, r2, r1, r10, r3)
            java.lang.Object r0 = r10.first
            r1 = r0
            m4b r1 = (defpackage.m4b) r1
            java.lang.Object r10 = r10.second
            k4b r10 = (defpackage.k4b) r10
        L_0x00a9:
            r0 = 0
            r11.z = r0
            r11.A = r0
            xs r2 = r11.j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00bc
            r11.z = r1
            r11.A = r10
            goto L_0x012d
        L_0x00bc:
            m4b r4 = r11.n
            k4b r2 = defpackage.k4b.c
            k3b r3 = r11.t
            android.util.Pair r10 = defpackage.j47.Y(r4, r2, r1, r10, r3)
            java.lang.Object r10 = r10.first
            r5 = r10
            m4b r5 = (defpackage.m4b) r5
            r11.n = r5
            p3b r10 = r4.d
            p3b r2 = r1.d
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x00e4
            p3b r10 = r4.e
            p3b r1 = r1.e
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r8 = r0
            goto L_0x00eb
        L_0x00e4:
            int r10 = r5.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8 = r10
        L_0x00eb:
            tb8 r10 = r4.s()
            tb8 r1 = r5.s()
            boolean r10 = defpackage.oaf.a(r10, r1)
            if (r10 != 0) goto L_0x0101
            int r10 = r5.b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9 = r10
            goto L_0x0102
        L_0x0101:
            r9 = r0
        L_0x0102:
            mue r10 = r4.j
            mue r1 = r5.j
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x0114
            int r10 = r5.k
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6 = r10
            goto L_0x0115
        L_0x0114:
            r6 = r0
        L_0x0115:
            int r10 = r4.u
            int r1 = r5.u
            if (r10 != r1) goto L_0x0124
            boolean r10 = r4.t
            boolean r2 = r5.t
            if (r10 == r2) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r7 = r0
            goto L_0x0129
        L_0x0124:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0122
        L_0x0129:
            r3 = r11
            r3.W0(r4, r5, r6, r7, r8, r9)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y98.c(w98):void");
    }

    public boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7, MotionEvent motionEvent) {
        int i3;
        x77 x77;
        lk7 lk72 = lk7;
        ht8 ht8 = (ht8) this.c;
        long j = ht8.J0;
        bc7[] bc7Arr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = ((b69) ((xs8) this.b)).a;
        messagesListWidget.getClass();
        bc7[] bc7Arr2 = MessagesListWidget.X0;
        bc7 bc7 = bc7Arr2[1];
        long[] jArr = (long[]) messagesListWidget.c.a(messagesListWidget);
        w4d w4d = messagesListWidget.J0;
        if (jArr == null || ((x77 = (x77) w4d.T0(messagesListWidget, bc7Arr2[7])) != null && !x77.isActive())) {
            if (messagesListWidget.x0().A().d()) {
                messagesListWidget.x0().A().e(j);
            } else {
                lk7 lk73 = lk7.a;
                View view = ht8.I0;
                if (lk72 == lk73 || lk72 == lk7.Y) {
                    int i4 = ju0.B(str) ? 3 : ju0.C(str) ? 2 : 1;
                    tx8 w = messagesListWidget.x0().w();
                    if (w != null) {
                        it8 it8 = (it8) messagesListWidget.w0.getValue();
                        int s = au1.s(i4);
                        if (s == 0) {
                            i3 = 1;
                        } else if (s == 1) {
                            i3 = 3;
                        } else if (s == 2) {
                            i3 = 2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        it8.a(j, i3, w, 1);
                    }
                    w4d.o1(messagesListWidget, bc7Arr2[7], j47.T(messagesListWidget.getViewLifecycleScope(), (lx3) null, vx3.b, new z59(j, str, motionEvent, messagesListWidget, i4, lk7, (ViewGroup) view, (Continuation) null), 1));
                    return true;
                }
                messagesListWidget.z0(j, view);
            }
        }
        return true;
    }

    public void e(ez9 ez9) {
        dm4.d(ez9, new uy1((Object) new tpc(j47.S(zd6.a, ql4.b.plus((lx3) this.b), vx3.c, new xpc((zn5) ((mn5) this.c), ez9, (Continuation) null)))));
    }

    public void f(qv6 qv6) {
        y7g y7g = (y7g) this.b;
        y7g.getClass();
        ((pv6) this.c).f(y7g);
    }

    public int i(int i) {
        int i2 = 4;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr = NotificationsSettingsScreen.v0;
                hdc adapter = ((EndlessRecyclerView2) obj2).getAdapter();
                nd3 nd3 = adapter instanceof nd3 ? (nd3) adapter : null;
                if (nd3 == null) {
                    return 0;
                }
                Pair D = nd3.D(i);
                Integer num = D.first instanceof mfd ? (Integer) D.second : -1;
                mfd mfd = ((NotificationsSettingsScreen) obj).X;
                int j = mfd.j();
                int intValue = num.intValue();
                if (intValue < 0 || intValue >= j) {
                    return 0;
                }
                kfd kfd = (kfd) ((ol7) mfd.C(num.intValue()));
                if (!(kfd.u() == 0 || num.intValue() == mfd.j() - 1)) {
                    i2 = kfd.u() != ((kfd) ((ol7) mfd.C(num.intValue() - 1))).u() ? 1 : kfd.u() != ((kfd) ((ol7) mfd.C(num.intValue() + 1))).u() ? 3 : 2;
                }
                return i2;
            case 21:
                int l = ((efb) ((ol7) ((ProfileEditAdminPermissionsWidget) obj2).Z.C(i))).l();
                if (((bi9) obj).c(l & 536870911)) {
                    return 0;
                }
                if (dy7.A(l)) {
                    i2 = 1;
                } else if (dy7.C(l)) {
                    i2 = 2;
                } else if (dy7.B(l)) {
                    i2 = 3;
                }
                return i2;
            case 22:
                int l2 = ((efb) ((ol7) ((ProfileEditScreen) obj2).X.C(i))).l();
                if (((bi9) obj).c(l2 & 536870911)) {
                    return 0;
                }
                if (dy7.A(l2)) {
                    i2 = 1;
                } else if (dy7.C(l2)) {
                    i2 = 2;
                } else if (dy7.B(l2)) {
                    i2 = 3;
                }
                return i2;
            case 23:
                int l3 = ((cjb) ((ol7) ((ProfileInviteScreen) obj2).o.C(i))).l();
                if (((bi9) obj).c(l3 & 536870911)) {
                    return 0;
                }
                if ((l3 & 536870912) != 0) {
                    i2 = 1;
                } else if ((l3 & 1073741824) != 0) {
                    i2 = 2;
                } else if ((l3 & Integer.MIN_VALUE) != 0) {
                    i2 = 3;
                }
                return i2;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                int l4 = ((efb) ((ol7) ((ProfileMemberPermissionsScreen) obj2).c.C(i))).l();
                if (((bi9) obj).c(l4 & 536870911)) {
                    return 0;
                }
                if (dy7.A(l4)) {
                    i2 = 1;
                } else if (dy7.C(l4)) {
                    i2 = 2;
                } else if (dy7.B(l4)) {
                    i2 = 3;
                }
                return i2;
            default:
                bc7[] bc7Arr2 = ProfileScreen.D0;
                int l5 = ((cjb) ((ol7) ((qlb) ((EndlessRecyclerView2) obj2).getAdapter()).C(i))).l();
                if (((bi9) obj).c(l5 & 536870911)) {
                    return 0;
                }
                if ((l5 & 536870912) != 0) {
                    i2 = 1;
                } else if ((l5 & 1073741824) != 0) {
                    i2 = 2;
                } else if ((l5 & Integer.MIN_VALUE) != 0) {
                    i2 = 3;
                }
                return i2;
        }
    }

    public void invoke(Object obj) {
        ((n3b) obj).G(((Integer) this.c).intValue(), ((m4b) ((ai3) this.b).a).s());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r16v1, types: [ee9] */
    /* JADX WARNING: type inference failed for: r5v2, types: [w2f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(defpackage.nqd r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.Object r1 = r0.b
            bk9 r1 = (defpackage.bk9) r1
            p4d r2 = r1.X
            java.lang.Object r0 = r0.c
            up7 r0 = (defpackage.up7) r0
            r4d r2 = r2.h(r0)
            java.lang.String r3 = r0.a()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.content.Context r1 = r1.o
            em5 r1 = defpackage.s36.u(r1, r3)
            java.lang.Object r3 = r1.f
            android.graphics.Point r3 = (android.graphics.Point) r3
            if (r2 == 0) goto L_0x004b
            ref r4 = r2.b
            if (r4 != 0) goto L_0x0029
            goto L_0x004b
        L_0x0029:
            w2f r15 = new w2f
            java.lang.String r6 = r0.a()
            int r7 = r3.x
            int r8 = r3.y
            ref r0 = r2.b
            float r2 = r0.b
            long r9 = r1.c
            float r3 = (float) r9
            float r2 = r2 * r3
            long r10 = (long) r2
            float r0 = r0.c
            float r0 = r0 * r3
            long r12 = (long) r0
            int r9 = r1.d
            boolean r14 = r4.d
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r12, r14)
        L_0x0048:
            r0 = r24
            goto L_0x006e
        L_0x004b:
            ee9 r15 = new ee9
            ce9 r2 = new ce9
            java.lang.String r0 = r0.a()
            int r4 = r3.x
            int r3 = r3.y
            int r5 = r1.d
            r2.<init>(r4, r0, r3, r5)
            java.util.List r21 = java.util.Collections.singletonList(r2)
            r17 = 0
            long r0 = r1.c
            r22 = 0
            r16 = r15
            r19 = r0
            r16.<init>(r17, r19, r21, r22)
            goto L_0x0048
        L_0x006e:
            r0.a(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y98.j(nqd):void");
    }

    public Object k(ii8 ii8, oh8 oh8, int i) {
        switch (this.a) {
            case 7:
                return ii8.i() ? fm9.F(new sad(-100)) : oaf.g0((bm7) ((rj8) this.b).k(ii8, oh8, i), new u00((Object) ii8, (Object) oh8, (Object) (hj8) this.c, 18));
            default:
                return ii8.i() ? fm9.F(new sad(-100)) : oaf.g0((bm7) ((rj8) this.b).k(ii8, oh8, i), new u00((Object) ii8, (Object) oh8, (Object) (qj8) this.c, 19));
        }
    }

    public String q(lq1 lq1) {
        switch (this.a) {
            case 19:
                fd7 fd7 = (fd7) this.b;
                mpa mpa = (mpa) fd7.a;
                if (mpa != null) {
                    lq1 lq12 = (lq1) mpa.a;
                    Objects.requireNonNull(lq12);
                    lq12.c();
                }
                Object obj = this.c;
                fd7.a = new mpa(lq1, obj);
                return "PendingValue " + obj;
            default:
                ay1 ay1 = (ay1) this.c;
                synchronized (((k9b) this.b).a) {
                    b76 a2 = b76.a(dw6.c);
                    wp wpVar = new wp(6, (m56) new c0(5, ay1));
                    ok4 k = ju0.k();
                    a2.getClass();
                    kq0.a(kq0.K(a2, wpVar, k), new wva(lq1, 1, ay1), ju0.k());
                }
                return "ProcessCameraProvider-initializeCameraX";
        }
    }

    public Object u(Task task) {
        b9b b9b = (b9b) this.b;
        String str = (String) this.c;
        synchronized (b9b) {
            ((us) b9b.c).remove(str);
        }
        return task;
    }

    public /* synthetic */ y98(si8 si8, y9d y9d, Bundle bundle) {
        this.a = 3;
        this.b = si8;
        this.c = bundle;
    }

    public /* synthetic */ y98(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
