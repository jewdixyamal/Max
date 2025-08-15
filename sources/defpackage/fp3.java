package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;
import org.apache.http.HttpHost;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: fp3  reason: default package */
public abstract class fp3 {
    public static final Object a = new Object();
    public static ExecutorService b;
    public static final ou6 c = new ou6("drawable", ".drawable");
    public static final nde d = new nde();

    public static final void D(CharSequence charSequence) {
        Object[] objArr = null;
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            try {
                objArr = spannable.getSpans(0, spannable.length(), sj.class);
            } catch (Throwable unused) {
            }
            sj[] sjVarArr = (sj[]) objArr;
            if (sjVarArr != null) {
                for (sj sjVar : sjVarArr) {
                    kp.w(spannable, c4f.class, spannable.getSpanStart(sjVar), spannable.getSpanEnd(sjVar));
                }
            }
        }
    }

    public static final Object E(pue pue, a66 a66) {
        Object obj;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        pag.q(pue, true, new gm4(0, j47.H(pue.uCont.getContext()).invokeOnTimeout(pue.a, pue, pue.getContext())));
        try {
            if (!(a66 instanceof gi0)) {
                obj = v3c.H(a66, pue, pue);
            } else {
                f8.c(2, a66);
                obj = a66.invoke(pue, pue);
            }
        } catch (Throwable th) {
            obj = new lb3(th, false);
        }
        tx3 tx3 = tx3.a;
        if (obj == tx3 || (makeCompletingOnce$kotlinx_coroutines_core = pue.makeCompletingOnce$kotlinx_coroutines_core(obj)) == a97.b) {
            return tx3;
        }
        if (makeCompletingOnce$kotlinx_coroutines_core instanceof lb3) {
            Throwable th2 = ((lb3) makeCompletingOnce$kotlinx_coroutines_core).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).a != pue) {
                throw th2;
            } else if (obj instanceof lb3) {
                throw ((lb3) obj).a;
            }
        } else {
            obj = a97.a(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return obj;
    }

    public static String F(l20 l20) {
        int i = 5;
        while (true) {
            g20 g20 = l20.a;
            int i2 = g20 == null ? -1 : ykd.$EnumSwitchMapping$0[g20.ordinal()];
            if (i2 == 1) {
                return l20.b.a();
            }
            if (i2 == 2) {
                return l20.d.d;
            }
            if (i2 != 3) {
                return null;
            }
            c20 c20 = l20.g;
            x10 x10 = c20.f;
            if (x10 != null) {
                if (x10 != null) {
                    return x10.a();
                }
                return null;
            } else if (!c20.a() || i < 0 || (l20 = c20.g) == null) {
                return null;
            } else {
                i--;
            }
        }
    }

    public static final g9g G(ja7 ja7, r6d r6d) {
        pag e = r6d.e();
        if (e instanceof k5b) {
            return g9g.POLY_OBJ;
        }
        if (tpa.f(e, nae.f)) {
            return g9g.LIST;
        }
        if (!tpa.f(e, nae.g)) {
            return g9g.OBJ;
        }
        r6d f = f(r6d.i(0), ja7.b);
        pag e2 = f.e();
        if ((e2 instanceof x8b) || tpa.f(e2, w6d.f)) {
            return g9g.MAP;
        }
        if (ja7.a.d) {
            return g9g.LIST;
        }
        throw xfg.a(f);
    }

    public static final Object H(long j, a66 a66, Continuation continuation) {
        if (j > 0) {
            return E(new pue(j, continuation), a66);
        }
        throw new TimeoutCancellationException("Timed out immediately", (x77) null);
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r0v2, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object I(long r7, defpackage.a66 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.que
            if (r0 == 0) goto L_0x0013
            r0 = r10
            que r0 = (defpackage.que) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            que r0 = new que
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            mec r7 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ TimeoutCancellationException -> 0x002a }
            goto L_0x0058
        L_0x002a:
            r8 = move-exception
            goto L_0x005b
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            defpackage.od2.a0(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x003e
            return r3
        L_0x003e:
            mec r10 = new mec
            r10.<init>()
            r0.getClass()     // Catch:{ TimeoutCancellationException -> 0x0059 }
            r0.o = r10     // Catch:{ TimeoutCancellationException -> 0x0059 }
            r0.Y = r4     // Catch:{ TimeoutCancellationException -> 0x0059 }
            pue r2 = new pue     // Catch:{ TimeoutCancellationException -> 0x0059 }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x0059 }
            r10.a = r2     // Catch:{ TimeoutCancellationException -> 0x0059 }
            java.lang.Object r10 = E(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x0059 }
            if (r10 != r1) goto L_0x0058
            return r1
        L_0x0058:
            return r10
        L_0x0059:
            r8 = move-exception
            r7 = r10
        L_0x005b:
            x77 r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L_0x0062
            return r3
        L_0x0062:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp3.I(long, a66, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static void c(Spannable spannable, ArrayList arrayList, fj fjVar) {
        ((ci) fjVar.a.get()).getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public static final Uri d(String str) {
        if (str.length() == 0) {
            return null;
        }
        return (eae.o0(str, "file:", true) || eae.o0(str, HttpHost.DEFAULT_SCHEME_NAME, true) || eae.o0(str, "content", true) || eae.o0(str, "android.resource", true) || eae.o0(str, "res:/", true)) ? Uri.parse(str) : Uri.parse("file:".concat(str));
    }

    public static final void e(qnf qnf, mm mmVar, gh7 gh7) {
        dsc dsc = (dsc) qnf.c("androidx.lifecycle.savedstate.vm.tag");
        if (dsc != null && !dsc.c) {
            dsc.a(mmVar, gh7);
            fg7 fg7 = gh7.d;
            if (fg7 == fg7.b || fg7.a(fg7.o)) {
                mmVar.g();
            } else {
                gh7.a(new bc4(gh7, 3, mmVar));
            }
        }
    }

    public static final r6d f(r6d r6d, oz7 oz7) {
        if (!tpa.f(r6d.e(), w6d.e)) {
            return r6d.isInline() ? f(r6d.i(0), oz7) : r6d;
        }
        j47.F(r6d);
        return r6d;
    }

    public static void g(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void h(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void i(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(k7d.j("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void j(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void l() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void m(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void p(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static dj3 q(ConstraintLayout constraintLayout) {
        dj3 dj3 = new dj3();
        dj3.c(constraintLayout);
        return dj3;
    }

    public static void r(long j, yaf yaf, xze[] xzeArr) {
        int i;
        while (true) {
            boolean z = true;
            if (yaf.c() > 1) {
                int i2 = 0;
                while (true) {
                    if (yaf.c() != 0) {
                        int v = yaf.v();
                        i2 += v;
                        if (v != 255) {
                            i = i2;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (yaf.c() != 0) {
                        int v2 = yaf.v();
                        i3 += v2;
                        if (v2 != 255) {
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                int i4 = yaf.b + i3;
                if (i3 == -1 || i3 > yaf.c()) {
                    i4 = yaf.c;
                } else if (i == 4 && i3 >= 8) {
                    int v3 = yaf.v();
                    int A = yaf.A();
                    int h = A == 49 ? yaf.h() : 0;
                    int v4 = yaf.v();
                    if (A == 47) {
                        yaf.I(1);
                    }
                    boolean z2 = v3 == 181 && (A == 49 || A == 47) && v4 == 3;
                    if (A == 49) {
                        if (h != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        s(j, yaf, xzeArr);
                    }
                }
                yaf.H(i4);
            } else {
                return;
            }
        }
    }

    public static void s(long j, yaf yaf, xze[] xzeArr) {
        int v = yaf.v();
        if ((v & 64) != 0) {
            yaf.I(1);
            int i = (v & 31) * 3;
            int i2 = yaf.b;
            for (xze xze : xzeArr) {
                yaf.H(i2);
                xze.c(i, yaf);
                if (j != -9223372036854775807L) {
                    xze.b(j, 1, i, 0, (vze) null);
                }
            }
        }
    }

    public static final boolean t(int i, Set set) {
        String str;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            switch (i) {
                case 1:
                    str = "MESSAGE_NORMAL_TEXT";
                    break;
                case 2:
                    str = "MESSAGE_BIG_EMOJI_TEXT";
                    break;
                case 3:
                    str = "MESSAGE_INPUT";
                    break;
                case 4:
                    str = "STICKERS_KEYBOARD";
                    break;
                case 5:
                    str = "CHATS_LIST";
                    break;
                case 6:
                    str = "REACTION_SELECT_PANEL";
                    break;
                case 7:
                    str = "REACTION_BADGE";
                    break;
                default:
                    throw null;
            }
            if (eae.i0(str, charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static final hlc u(Context context, String str, Class cls) {
        if (true ^ (str == null || w9e.C0(str))) {
            return new hlc(context, str, cls);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [hu3] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        if (r9 != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        if (r3 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r3 = new java.util.concurrent.CancellationException("Channel was consumed, consumer had failed");
        r3.initCause(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        r8.cancel(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        throw r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[Catch:{ all -> 0x0091 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object v(defpackage.on5 r7, defpackage.p8c r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ro5
            if (r0 == 0) goto L_0x0013
            r0 = r10
            ro5 r0 = (defpackage.ro5) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            ro5 r0 = new ro5
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003f
            if (r2 != r4) goto L_0x0037
            boolean r9 = r0.Z
            tt0 r7 = r0.Y
            p8c r8 = r0.X
            on5 r2 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            r10 = r7
            r7 = r2
            goto L_0x0056
        L_0x0035:
            r7 = move-exception
            goto L_0x0090
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            boolean r9 = r0.Z
            tt0 r7 = r0.Y
            p8c r8 = r0.X
            on5 r2 = r0.o
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x0035 }
            goto L_0x006b
        L_0x004b:
            defpackage.od2.a0(r10)
            boolean r10 = r7 instanceof defpackage.jte
            if (r10 != 0) goto L_0x00ab
            tt0 r10 = r8.iterator()     // Catch:{ all -> 0x0035 }
        L_0x0056:
            r0.o = r7     // Catch:{ all -> 0x0035 }
            r0.X = r8     // Catch:{ all -> 0x0035 }
            r0.Y = r10     // Catch:{ all -> 0x0035 }
            r0.Z = r9     // Catch:{ all -> 0x0035 }
            r0.t0 = r5     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r10.b(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L_0x006b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0035 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x0088
            java.lang.Object r10 = r7.c()     // Catch:{ all -> 0x0035 }
            r0.o = r2     // Catch:{ all -> 0x0035 }
            r0.X = r8     // Catch:{ all -> 0x0035 }
            r0.Y = r7     // Catch:{ all -> 0x0035 }
            r0.Z = r9     // Catch:{ all -> 0x0035 }
            r0.t0 = r4     // Catch:{ all -> 0x0035 }
            java.lang.Object r10 = r2.a(r10, r0)     // Catch:{ all -> 0x0035 }
            if (r10 != r1) goto L_0x0032
            return r1
        L_0x0088:
            if (r9 == 0) goto L_0x008d
            r8.cancel(r3)
        L_0x008d:
            e5f r7 = defpackage.e5f.a
            return r7
        L_0x0090:
            throw r7     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r10 = move-exception
            if (r9 == 0) goto L_0x00aa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L_0x009b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L_0x009b:
            if (r3 != 0) goto L_0x00a7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        L_0x00a7:
            r8.cancel(r3)
        L_0x00aa:
            throw r10
        L_0x00ab:
            jte r7 = (defpackage.jte) r7
            java.lang.Throwable r7 = r7.a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp3.v(on5, p8c, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Integer w(int i, h23 h23) {
        if (h23.equals(nec.a(sf7.class))) {
            return Integer.valueOf(yoc.q0);
        }
        if (h23.equals(nec.a(xc.class))) {
            return Integer.valueOf(yoc.p0);
        }
        if (h23.equals(nec.a(kq9.class))) {
            return Integer.valueOf(yoc.r0);
        }
        if (h23.equals(nec.a(kz4.class))) {
            int s = au1.s(i);
            if (s == 0) {
                return Integer.valueOf(yoc.n0);
            }
            if (s == 1) {
                return null;
            }
            if (s == 2) {
                return Integer.valueOf(yoc.o0);
            }
            throw new NoWhenBranchMatchedException();
        }
        h23 a2 = nec.a(h23.class);
        throw new IllegalStateException("Such validation rule (" + a2 + " is not implemented");
    }

    public static float x(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static Bitmap y(Context context, int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = bga.a;
                break;
            case 1:
                i2 = bga.b;
                break;
            case 2:
                i2 = bga.m;
                break;
            case 3:
                i2 = bga.s;
                break;
            case 4:
                i2 = bga.t;
                break;
            case 5:
                i2 = bga.u;
                break;
            case 6:
                i2 = bga.v;
                break;
            case 7:
                i2 = bga.w;
                break;
            case 8:
                i2 = bga.x;
                break;
            case 9:
                i2 = bga.y;
                break;
            case 10:
                i2 = bga.c;
                break;
            case 11:
                i2 = bga.d;
                break;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                i2 = bga.e;
                break;
            case 13:
                i2 = bga.f;
                break;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                i2 = bga.g;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                i2 = bga.h;
                break;
            case 16:
                i2 = bga.i;
                break;
            case LangUtils.HASH_SEED /*17*/:
                i2 = bga.j;
                break;
            case 18:
                i2 = bga.k;
                break;
            case 19:
                i2 = bga.l;
                break;
            case 20:
                i2 = bga.n;
                break;
            case 21:
                i2 = bga.o;
                break;
            case 22:
                i2 = bga.p;
                break;
            case 23:
                i2 = bga.q;
                break;
            default:
                i2 = bga.r;
                break;
        }
        Drawable n = s36.n(context, i2);
        if (n instanceof BitmapDrawable) {
            return ((BitmapDrawable) n).getBitmap();
        }
        return null;
    }

    public static e8b z(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        qo9 qo9 = null;
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            xo9 xo9 = (xo9) it.next();
            linkedHashMap.put(Integer.valueOf(i), xo9.a);
            for (po9 po9 : xo9.b) {
                Boolean bool = po9.c;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                qo9 qo92 = new qo9(po9.a, po9.b, i, booleanValue);
                arrayList.add(qo92);
                if (booleanValue && qo9 == null) {
                    qo9 = qo92;
                }
            }
            i = i2;
        }
        return new e8b(linkedHashMap, arrayList, qo9);
    }

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }
}
