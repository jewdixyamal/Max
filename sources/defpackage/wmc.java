package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.util.Range;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.google.android.gms.location.LocationResult;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.stickerssearch.StickersSearchScreen;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;

/* renamed from: wmc  reason: default package */
public final class wmc implements nr8, mde, qj3, h6d, rpa, a76, w2e, u4, uq8, im7 {
    public static wmc b;
    public static final xmc c = new xmc(0, false, false, 0, 0);
    public Object a;

    public /* synthetic */ wmc(Object obj, boolean z) {
        this.a = obj;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, wmc] */
    public static synchronized wmc h() {
        wmc wmc;
        synchronized (wmc.class) {
            try {
                if (b == null) {
                    b = new Object();
                }
                wmc = b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return wmc;
    }

    public void Q(wq8 wq8) {
        Toolbar toolbar = (Toolbar) this.a;
        e7 e7Var = toolbar.a.s0;
        if (e7Var == null || !e7Var.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.U0.b).iterator();
            while (it.hasNext()) {
                ((e16) it.next()).a.t(wq8);
            }
        }
        uq8 uq8 = toolbar.c1;
        if (uq8 != null) {
            uq8.Q(wq8);
        }
    }

    public void a(Object obj) {
        List list = (List) obj;
        adc adc = (adc) this.a;
        adc.i(adc.T, adc.S);
    }

    public void accept(Object obj) {
        v6f v6f = (v6f) obj;
        b32 b32 = (b32) this.a;
        b32.getClass();
        if (v6f.a()) {
            String str = v6f.h.a;
            long j = b32.o;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            String str2 = b32.Z;
            if (i != 0) {
                hm9.m(str2, "updateChatAvatar", new Object[0]);
                e52 C = b32.b().C(j);
                if (C != null) {
                    pk a2 = b32.a();
                    ((k4a) a2).m(b32.o, C.b.a, (String) null, str, b32.X);
                } else {
                    hm9.p(str2, "updateChatAvatar: chat not found, chatId=" + j, (Throwable) null);
                }
            } else {
                hm9.m(str2, "updateProfileAvatar", new Object[0]);
                long unused = ((k4a) b32.a()).H(2, 0, b32.X, (String) null, (String) null, str, (String) null, (String) null);
            }
            b32.s().d(b32.b);
        }
    }

    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.a;
        boolean z = false;
        if (!swipeDismissBehavior.x(view)) {
            return false;
        }
        WeakHashMap weakHashMap = zmf.a;
        if (view.getLayoutDirection() == 1) {
            z = true;
        }
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight(((i != 0 || !z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    public void c(wq8 wq8, boolean z) {
        cn cnVar;
        wq8 k = wq8.k();
        int i = 0;
        boolean z2 = k != wq8;
        if (z2) {
            wq8 = k;
        }
        dn dnVar = (dn) this.a;
        cn[] cnVarArr = dnVar.W0;
        int length = cnVarArr != null ? cnVarArr.length : 0;
        while (true) {
            if (i < length) {
                cnVar = cnVarArr[i];
                if (cnVar != null && cnVar.h == wq8) {
                    break;
                }
                i++;
            } else {
                cnVar = null;
                break;
            }
        }
        if (cnVar == null) {
            return;
        }
        if (z2) {
            dnVar.n(cnVar.a, cnVar, k);
            dnVar.p(cnVar, true);
            return;
        }
        dnVar.p(cnVar, z);
    }

    public void d(Throwable th) {
        adc adc = (adc) this.a;
        c54.p("In-progress recording shouldn't be null", adc.q != null);
        if (!adc.q.w0) {
            Objects.toString(th);
            adc.i(th, adc.C == null ? 8 : 6);
        }
    }

    public void f(Object obj) {
        le6 le6 = (le6) obj;
        le6.getClass();
        List list = ((LocationResult) this.a).a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        le6.a.c.p1(new er7(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
    }

    public void g(z2e z2e) {
        f5e f5e = f5e.c;
        bc7[] bc7Arr = StickersSearchScreen.u0;
        StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.a;
        stickersSearchScreen.getClass();
        bc7 bc7 = StickersSearchScreen.u0[0];
        long longValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
        f64 P1 = f5e.P1();
        P1.b(":stickers/preview?sticker_id=" + z2e.a + "&chat_id=" + longValue, (Bundle) null);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [a8g, java.lang.Object] */
    public Object get() {
        o90 o90 = (o90) this.a;
        int i = o90.c;
        if (i == -1) {
            i = 5;
        }
        int i2 = o90.b;
        if (i2 == -1) {
            i2 = 2;
        }
        int i3 = o90.e;
        if (i3 == -1) {
            i3 = 1;
        }
        Range range = o90.g;
        Range range2 = o90.d;
        int F = range.equals(range2) ? 44100 : wmd.F(range2, i3, i2, ((Integer) range2.getUpper()).intValue());
        List list = n90.e;
        ? obj = new Object();
        obj.a = -1;
        obj.b = -1;
        obj.c = -1;
        obj.o = -1;
        obj.a = Integer.valueOf(i);
        obj.o = Integer.valueOf(i2);
        obj.c = Integer.valueOf(i3);
        obj.b = Integer.valueOf(F);
        return obj.c();
    }

    public Object i() {
        return this.a;
    }

    public void j(j6d j6d) {
        tn6 tn6 = (tn6) j6d;
        fm6 fm6 = (fm6) this.a;
        fm6.D0.j(fm6);
    }

    public void k(z2e z2e) {
        bc7[] bc7Arr = StickersSearchScreen.u0;
        q5e n0 = ((StickersSearchScreen) this.a).n0();
        long j = n0.b;
        if (j > 0) {
            ((s8g) n0.X.getValue()).a(new v8d(new u8d(j, z2e.a, 1)));
            pnf.o(n0.t0, g43.b);
        }
        xx6 xx6 = (xx6) e5e.a.getAccessor().e();
        if (xx6 != null) {
            xx6.f(bcd.a0(new wx6(ux6.SEND_5_MESSAGES, 1), new wx6(ux6.SEND_3_STICKERS, 1)), wuc.CHAT);
        }
    }

    public boolean l() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        r8 = (r8 = r8.getMe()).getExternalId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(long r8) {
        /*
            r7 = this;
            bc7[] r0 = one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet.x0
            java.lang.Object r7 = r7.a
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r7 = (one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet) r7
            je7 r0 = r7.t0
            java.lang.Object r0 = r0.getValue()
            ie1 r0 = (defpackage.ie1) r0
            r0.getClass()
            int r1 = defpackage.y7a.x
            long r1 = (long) r1
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r2 = 1
            el1 r3 = r0.c
            if (r1 != 0) goto L_0x0027
            s35 r8 = r3.M0
            rj1 r9 = new rj1
            r9.<init>(r2)
            defpackage.pnf.o(r8, r9)
            goto L_0x010b
        L_0x0027:
            int r1 = defpackage.y7a.z
            long r4 = (long) r1
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r4 = 0
            if (r1 != 0) goto L_0x003b
            s35 r8 = r3.M0
            rj1 r9 = new rj1
            r9.<init>(r4)
            defpackage.pnf.o(r8, r9)
            goto L_0x010b
        L_0x003b:
            int r1 = defpackage.y7a.s
            long r5 = (long) r1
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004b
            s35 r8 = r3.M0
            nj1 r9 = defpackage.nj1.D
            defpackage.pnf.o(r8, r9)
            goto L_0x010b
        L_0x004b:
            int r1 = defpackage.y7a.u
            long r5 = (long) r1
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00ad
            je7 r8 = r0.Z
            java.lang.Object r8 = r8.getValue()
            lvc r8 = (defpackage.lvc) r8
            vvc r8 = (defpackage.vvc) r8
            r8.getClass()
            q0e r9 = r8.t0
            java.lang.Object r9 = r9.getValue()
            wvc r9 = (defpackage.wvc) r9
            kvc r9 = r9.b
            if (r9 == 0) goto L_0x0096
            gg1 r9 = r9.c
            if (r9 != 0) goto L_0x0070
            goto L_0x0096
        L_0x0070:
            je7 r8 = r8.b
            java.lang.Object r8 = r8.getValue()
            fw3 r8 = (defpackage.fw3) r8
            ru.ok.android.externcalls.sdk.Conversation r8 = r8.a()
            if (r8 == 0) goto L_0x008f
            ru.ok.android.externcalls.sdk.ConversationParticipant r8 = r8.getMe()
            if (r8 == 0) goto L_0x008f
            ru.ok.android.externcalls.sdk.id.ParticipantId r8 = r8.getExternalId()
            if (r8 == 0) goto L_0x008f
            gg1 r8 = defpackage.mqa.b(r8)
            goto L_0x0091
        L_0x008f:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L_0x0091:
            boolean r8 = r9.equals(r8)
            goto L_0x0097
        L_0x0096:
            r8 = r4
        L_0x0097:
            if (r8 == 0) goto L_0x00a5
            je7 r8 = r0.s0
            java.lang.Object r8 = r8.getValue()
            ir1 r8 = (defpackage.ir1) r8
            r8.k(r4)
            goto L_0x010b
        L_0x00a5:
            s35 r8 = r3.M0
            pj1 r9 = defpackage.pj1.D
            defpackage.pnf.o(r8, r9)
            goto L_0x010b
        L_0x00ad:
            int r0 = defpackage.y7a.r
            long r0 = (long) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            s35 r8 = r3.M0
            ij1 r9 = defpackage.ij1.D
            defpackage.pnf.o(r8, r9)
            goto L_0x010b
        L_0x00bc:
            int r0 = defpackage.y7a.G
            long r0 = (long) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00cb
            s35 r8 = r3.M0
            hj1 r9 = defpackage.hj1.D
            defpackage.pnf.o(r8, r9)
            goto L_0x010b
        L_0x00cb:
            int r0 = defpackage.y7a.b1
            long r0 = (long) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00df
            s35 r8 = r3.M0
            bj1 r9 = new bj1
            nnf r0 = defpackage.nnf.c
            r9.<init>(r0)
            defpackage.pnf.o(r8, r9)
            goto L_0x010b
        L_0x00df:
            int r0 = defpackage.y7a.c1
            long r0 = (long) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00f3
            s35 r8 = r3.M0
            bj1 r9 = new bj1
            nnf r0 = defpackage.nnf.a
            r9.<init>(r0)
            defpackage.pnf.o(r8, r9)
            goto L_0x010b
        L_0x00f3:
            int r0 = defpackage.y7a.w
            long r0 = (long) r0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x010b
            s35 r8 = r3.M0
            je1 r9 = defpackage.je1.c
            r9.getClass()
            c64 r9 = new c64
            java.lang.String r0 = ":call-admin-settings"
            r9.<init>(r0)
            defpackage.pnf.o(r8, r9)
        L_0x010b:
            r7.s0(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmc.m(long):void");
    }

    public Object n() {
        return this.a;
    }

    public boolean o(wq8 wq8) {
        Window.Callback callback;
        if (wq8 != wq8.k()) {
            return true;
        }
        dn dnVar = (dn) this.a;
        if (!dnVar.Q0 || (callback = dnVar.w0.getCallback()) == null || dnVar.b1) {
            return true;
        }
        callback.onMenuOpened(108, wq8);
        return true;
    }

    public void p() {
        fm6 fm6 = (fm6) this.a;
        int i = fm6.E0 - 1;
        fm6.E0 = i;
        if (i <= 0) {
            int i2 = 0;
            for (tn6 tn6 : fm6.G0) {
                tn6.d();
                i2 += tn6.T0.a;
            }
            rze[] rzeArr = new rze[i2];
            int i3 = 0;
            for (tn6 tn62 : fm6.G0) {
                tn62.d();
                int i4 = tn62.T0.a;
                int i5 = 0;
                while (i5 < i4) {
                    tn62.d();
                    rzeArr[i3] = tn62.T0.a(i5);
                    i5++;
                    i3++;
                }
            }
            fm6.F0 = new tze(rzeArr);
            fm6.D0.e(fm6);
        }
    }

    public void q(long j, boolean z) {
        bc7[] bc7Arr = CallAdminSettingsScreen.t0;
        k01 m0 = ((CallAdminSettingsScreen) this.a).m0();
        int i = (int) j;
        m0.getClass();
        int i2 = y7a.a;
        rd8 rd8 = rd8.c;
        rd8 rd82 = rd8.a;
        if (i == i2) {
            yz0 yz0 = (yz0) m0.q();
            MediaMuteManager e = yz0.e();
            if (e != null) {
                ky7 ky7 = new ky7();
                qd8 qd8 = qd8.b;
                if (z) {
                    rd8 = rd82;
                }
                ky7.put(qd8, rd8);
                MediaMuteManager.updateMediaOptionsForAll$default(e, ky7.b(), (zad) null, new gz0(yz0, z, 1), new hz0(yz0, z, 1), 2, (Object) null);
            }
        } else if (i == y7a.h) {
            yz0 yz02 = (yz0) m0.q();
            MediaMuteManager e2 = yz02.e();
            if (e2 != null) {
                ky7 ky72 = new ky7();
                qd8 qd82 = qd8.a;
                if (z) {
                    rd8 = rd82;
                }
                ky72.put(qd82, rd8);
                MediaMuteManager.updateMediaOptionsForAll$default(e2, ky72.b(), (zad) null, new gz0(yz02, z, 0), new hz0(yz02, z, 0), 2, (Object) null);
            }
        } else if (i == y7a.j) {
            yz0 yz03 = (yz0) m0.q();
            MediaMuteManager e3 = yz03.e();
            if (e3 != null) {
                ky7 ky73 = new ky7();
                qd8 qd83 = qd8.c;
                if (z) {
                    rd8 = rd82;
                }
                ky73.put(qd83, rd8);
                MediaMuteManager.updateMediaOptionsForAll$default(e3, ky73.b(), (zad) null, new gz0(yz03, z, 2), new hz0(yz03, z, 2), 2, (Object) null);
            }
        } else if (i == y7a.i) {
            if (!z) {
                lvc lvc = m0.b.i;
                lvc.getClass();
                if (((wvc) ((vvc) lvc).t0.getValue()).a == xvc.a) {
                    pnf.o(m0.t0, pj1.D);
                    return;
                }
            }
            ((yz0) m0.q()).i(z);
        } else if (i == y7a.k) {
            yz0 yz04 = (yz0) m0.q();
            ir6 ir6 = hm9.m;
            if (ir6 != null) {
                yz04.getClass();
                if (ir6.c()) {
                    ir6.d(us7.X, "CallAdminSettingsController", ey8.j("Waiting room change state to ", z), (Throwable) null);
                }
            }
            Conversation a2 = yz04.d().a();
            if (a2 != null) {
                Conversation.setWaitingRoomEnabled$default(a2, z, (rj3) null, 2, (Object) null);
            }
        }
    }

    public void r() {
        ((InputContentInfo) this.a).requestPermission();
    }

    public boolean z(wq8 wq8, MenuItem menuItem) {
        uq8 uq8 = ((Toolbar) this.a).c1;
        return uq8 != null && uq8.z(wq8, menuItem);
    }

    public wmc(int i) {
        Object obj;
        switch (i) {
            case 10:
                this.a = new i56(5, 1, (byte) 0);
                return;
            case 20:
                this.a = (ExtraCroppingQuirk) zi4.a.e(ExtraCroppingQuirk.class);
                return;
            default:
                mi9 b2 = mi9.b();
                this.a = b2;
                Object obj2 = null;
                try {
                    obj = b2.h(cne.e0);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Class<ay1> cls2 = ay1.class;
                if (cls == null || cls.equals(cls2)) {
                    aa0 aa0 = cne.e0;
                    mi9 mi9 = (mi9) this.a;
                    mi9.j(aa0, cls2);
                    try {
                        obj2 = mi9.h(cne.d0);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj2 == null) {
                        mi9.j(cne.d0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }
}
