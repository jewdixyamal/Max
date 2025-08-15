package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: qi8  reason: default package */
public final class qi8 implements z66, nh8, tk6, dce {
    public Object X;
    public Object a;
    public Object b;
    public Object c;
    public long o;

    public static final List m(qi8 qi8, fk2 fk2, String str) {
        qi8.getClass();
        return l6d.i0(l6d.Z(new r1f(l6d.Z(new at(2, fk2.c), new rpc(12, qi8)), new k5d((Object) qi8, str, 5)), new w8c(16)));
    }

    public static void n(ArrayList arrayList, List list) {
        String str = (String) l6d.c0(new r1f(l6d.Z(new at(2, list), new rpc()), new w8c(15)));
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = tpa.m(str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() > 0) {
                arrayList.add(str);
            }
        }
    }

    public void A() {
        si8 si8 = (si8) this.X;
        si8.S(si8.f.s);
    }

    public void B(int i) {
        bi8 bi8 = ((si8) this.X).j;
        int n = gf7.n(i);
        wh8 wh8 = bi8.a;
        if (wh8.j != n) {
            wh8.j = n;
            synchronized (wh8.d) {
                for (int beginBroadcast = wh8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((mr6) wh8.f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(n);
                    } catch (RemoteException unused) {
                    }
                }
                wh8.f.finishBroadcast();
            }
        }
    }

    public void C(boolean z) {
        bi8 bi8 = ((si8) this.X).j;
        jx6 jx6 = gf7.a;
        wh8 wh8 = bi8.a;
        if (wh8.k != z) {
            wh8.k = z ? 1 : 0;
            synchronized (wh8.d) {
                for (int beginBroadcast = wh8.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((mr6) wh8.f.getBroadcastItem(beginBroadcast)).onShuffleModeChanged(z);
                    } catch (RemoteException unused) {
                    }
                }
                wh8.f.finishBroadcast();
            }
        }
    }

    public void D(mue mue) {
        F(mue);
        E();
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [qi8, java.lang.Object, z66] */
    public void E() {
        Bitmap bitmap;
        ib8 ib8;
        si8 si8 = (si8) this.X;
        x4b x4b = si8.f.s;
        tb8 W = x4b.W();
        gd8 i0 = x4b.i0();
        long j = -9223372036854775807L;
        if ((!x4b.t1(16) || !x4b.K1()) && x4b.t1(16)) {
            j = x4b.c();
        }
        String str = W != null ? W.a : "";
        Uri uri = (W == null || (ib8 = W.b) == null) ? null : ib8.a;
        if (!Objects.equals((gd8) this.a, i0) || !Objects.equals((String) this.b, str) || !Objects.equals((Uri) this.c, uri) || this.o != j) {
            this.b = str;
            this.c = uri;
            this.a = i0;
            this.o = j;
            ii8 ii8 = si8.f;
            bm7 v = ii8.m.v(i0);
            if (v != null) {
                si8.o = null;
                if (v.isDone()) {
                    try {
                        bitmap = (Bitmap) fm9.C(v);
                    } catch (CancellationException | ExecutionException e) {
                        z04.c0("Failed to load bitmap: " + e.getMessage());
                    }
                    si8.J(si8.j, gf7.l(i0, str, uri, j, bitmap));
                }
                ? obj = new Object();
                obj.X = this;
                obj.a = i0;
                obj.b = str;
                obj.c = uri;
                obj.o = j;
                si8.o = obj;
                Handler handler = ii8.l;
                Objects.requireNonNull(handler);
                v.d(new h76(v, 0, obj), new a84(handler, 0));
            }
            bitmap = null;
            si8.J(si8.j, gf7.l(i0, str, uri, j, bitmap));
        }
    }

    public void F(mue mue) {
        si8 si8 = (si8) this.X;
        x4b x4b = si8.f.s;
        if (!(x4b.X.a(17) && x4b.s().a(17)) || mue.q()) {
            si8.L(si8.j, (ArrayList) null);
            return;
        }
        jx6 jx6 = gf7.a;
        ArrayList arrayList = new ArrayList();
        kue kue = new kue();
        for (int i = 0; i < mue.p(); i++) {
            arrayList.add(mue.n(i, kue, 0).c);
        }
        ArrayList arrayList2 = new ArrayList();
        vq1 vq1 = new vq1(this, new AtomicInteger(0), arrayList, arrayList2, mue, 5);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((tb8) arrayList.get(i2)).d.k;
            if (bArr == null) {
                arrayList2.add((Object) null);
                vq1.run();
            } else {
                ii8 ii8 = si8.f;
                bm7 B = ii8.m.B(bArr);
                arrayList2.add(B);
                Handler handler = ii8.l;
                Objects.requireNonNull(handler);
                B.d(vq1, new a84(handler, 0));
            }
        }
    }

    public void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qi8 qi8 = (qi8) this.X;
        si8 si8 = (si8) qi8.X;
        if (this == si8.o) {
            long j = this.o;
            si8.J(si8.j, gf7.l((gd8) this.a, (String) this.b, (Uri) this.c, j, bitmap));
            ii8 ii8 = ((si8) qi8.X).f;
            oaf.W(ii8.o, new ci8(ii8, 1));
        }
    }

    public List c() {
        return (List) ((k4a) ((pk) this.a)).K(new au(this.o, "MEMBER", 0, 100, (String) null), (ztc) this.c).h(new gd1(21, this)).e();
    }

    public void d(Throwable th) {
        if (this == ((si8) ((qi8) this.X).X).o) {
            z04.c0("Failed to load bitmap: " + th.getMessage());
        }
    }

    public List g(String str) {
        return (List) new frd(((k4a) ((pk) this.a)).K(new au(this.o, "MEMBER", 0, 100, str == null ? null : (str.length() <= 1 || str.charAt(0) != '@') ? str : str.substring(1)), (ztc) this.c).h(new aab(this, str)), (b66) null, nz4.a).e();
    }

    public void h(int i, k3b k3b) {
        si8 si8 = (si8) this.X;
        x4b x4b = si8.f.s;
        si8.K(si8, x4b);
        si8.S(x4b);
    }

    public sk6 i() {
        int ordinal = ((mg4) this.a).ordinal();
        if (ordinal == 0) {
            return (h8a) ((khe) this.c).getValue();
        }
        if (ordinal == 1) {
            return (f8a) ((khe) this.X).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public void k(int i, qad qad, boolean z, boolean z2, int i2) {
        si8 si8 = (si8) this.X;
        si8.S(si8.f.s);
    }

    public List l(LinkedHashSet linkedHashSet) {
        if (Looper.getMainLooper().isCurrentThread()) {
            hm9.l0("SuggestContactsNetworkRepository", "Load contacts was called from the main thread.", new IllegalStateException("Load contacts was called from the main thread."));
        }
        return (List) j47.f0(hz4.a, new cce(this, linkedHashSet, (Continuation) null));
    }

    public void o(h30 h30) {
        si8 si8 = (si8) this.X;
        if (si8.f.s.I().a == 0) {
            int w = gf7.w(h30);
            wh8 wh8 = si8.j.a;
            wh8.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(w);
            wh8.a.setPlaybackToLocal(builder.build());
        }
    }

    public void onDisconnected() {
    }

    public void p() {
        v4b v4b;
        int i;
        si8 si8 = (si8) this.X;
        x4b x4b = si8.f.s;
        if (x4b.I().a == 0) {
            v4b = null;
        } else {
            k3b s = x4b.s();
            if (s.a.a(26, 34)) {
                i = s.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(x4b.a.z1());
            int l = x4b.t1(23) ? x4b.l() : 0;
            ui4 I = x4b.I();
            v4b = new v4b(x4b, i, I.c, l, I.d, handler);
        }
        si8.m = v4b;
        bi8 bi8 = si8.j;
        if (v4b == null) {
            int w = gf7.w(x4b.t1(21) ? x4b.F() : h30.g);
            wh8 wh8 = bi8.a;
            wh8.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(w);
            wh8.a.setPlaybackToLocal(builder.build());
            return;
        }
        wh8 wh82 = bi8.a;
        wh82.getClass();
        wh82.a.setPlaybackToRemote(v4b.a());
    }

    public void q(int i, boolean z) {
        v4b v4b = ((si8) this.X).m;
        if (v4b != null) {
            if (z) {
                i = 0;
            }
            v4b.d = i;
            sqf.a(v4b.a(), i);
        }
    }

    public void r() {
        si8 si8 = (si8) this.X;
        si8.S(si8.f.s);
    }

    public void s(tb8 tb8) {
        E();
        si8 si8 = (si8) this.X;
        if (tb8 == null) {
            si8.j.a.a.setRatingType(0);
        } else {
            bi8 bi8 = si8.j;
            bi8.a.a.setRatingType(gf7.x(tb8.d.i));
        }
        si8.S(si8.f.s);
    }

    public void t() {
        si8 si8 = (si8) this.X;
        si8.S(si8.f.s);
    }

    public void u() {
        si8 si8 = (si8) this.X;
        si8.S(si8.f.s);
    }

    public void v() {
        si8 si8 = (si8) this.X;
        si8.S(si8.f.s);
    }

    public void w() {
        si8 si8 = (si8) this.X;
        si8.S(si8.f.s);
    }

    public void x(int i, x4b x4b) {
        D(x4b.c0());
        z(x4b.t1(18) ? x4b.k0() : gd8.J);
        x4b.i0();
        E();
        C(x4b.E0());
        B(x4b.getRepeatMode());
        x4b.I();
        p();
        si8.K((si8) this.X, x4b);
        s(x4b.W());
    }

    public void y() {
        si8 si8 = (si8) this.X;
        si8.S(si8.f.s);
    }

    public void z(gd8 gd8) {
        si8 si8 = (si8) this.X;
        CharSequence queueTitle = ((e98) si8.j.b.b).a.getQueueTitle();
        CharSequence charSequence = gd8.a;
        if (!TextUtils.equals(queueTitle, charSequence)) {
            x4b x4b = si8.f.s;
            if (!x4b.X.a(17) || !x4b.s().a(17)) {
                charSequence = null;
            }
            si8.j.a.a.setQueueTitle(charSequence);
        }
    }
}
