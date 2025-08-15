package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.view.View;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: v3c  reason: default package */
public abstract class v3c {
    public static final String[][] a = {new String[]{":-)", "😊"}, new String[]{":)", "😊"}, new String[]{":-(", "😞"}, new String[]{":(", "😞"}, new String[]{";-)", "😉"}, new String[]{";)", "😉"}, new String[]{":-D", "😂"}, new String[]{":D", "😂"}, new String[]{":-@", "😞"}, new String[]{":@", "😞"}, new String[]{"^o)", "😑"}, new String[]{":-S", "🙈"}, new String[]{":S", "🙈"}, new String[]{"*-)", "😏"}, new String[]{"*)", "😏"}, new String[]{":-|", "😠"}, new String[]{":|", "😠"}, new String[]{"8oI", "😡"}, new String[]{";(", "😢"}, new String[]{":'(", "😢"}, new String[]{":-P", "😜"}, new String[]{":P", "😜"}, new String[]{":-$", "😊"}, new String[]{":$", "😊"}, new String[]{":-O", "😳"}, new String[]{":O", "😳"}, new String[]{"|-)", "😪"}, new String[]{"|)", "😪"}, new String[]{"(ch)", "😊"}, new String[]{"(lo)", "😍"}, new String[]{"(sr)", "😔"}, new String[]{"|-(", "😴"}, new String[]{"|(", "😴"}, new String[]{"(H)", "😎"}, new String[]{"(hu)", "😬"}, new String[]{"(tr)", "😞"}, new String[]{"(md)", "😵"}, new String[]{"(fr)", "😄"}, new String[]{"(dt)", "😟"}, new String[]{"(sc)", "😬"}, new String[]{"(Y)", "👍"}, new String[]{"(N)", "👎"}, new String[]{"(v)", "✌"}, new String[]{"(L)", "❤"}, new String[]{"(U)", "💔"}, new String[]{"(K)", "💋"}, new String[]{"(F)", "⚘"}, new String[]{"(*)", "★"}, new String[]{"(^)", "🎂"}, new String[]{"(G)", "🎁"}, new String[]{"(B)", "🍺"}, new String[]{"(D)", "🍸"}, new String[]{"(CC)", "☕"}, new String[]{"(pi)", "🍕"}, new String[]{"(pl)", "🍴"}, new String[]{"(ic)", "🍦"}, new String[]{"($)", "💰"}, new String[]{"(co)", "💻"}, new String[]{"(so)", "⚽"}, new String[]{"(te)", "🎾"}, new String[]{"(nt)", "♬"}, new String[]{"(I)", "💡"}, new String[]{"(E)", "✉"}, new String[]{"(Z)", "👦"}, new String[]{"(X)", "👧"}, new String[]{"(S)", "🌙"}};
    public static final boolean[] b = new boolean[3];
    public static final /* synthetic */ int c = 0;

    public static void A(Context context, es8 es8, l20 l20, au8 au8, kk5 kk5) {
        try {
            ((y8a) vl.b()).b().f("ACTION_FILE_OPEN_VIEWER");
            z(context, l20, kk5);
        } catch (FileNotFoundException unused) {
            hm9.p("v3c", "file attach file not found", (Throwable) null);
            a14.N(0, context, context.getString(jpc.c0));
            au8.u(es8.a, l20.r, d20.a);
        } catch (Exception e) {
            hm9.p("v3c", "cant open file attach.", e);
            a14.N(0, context, context.getString(jpc.t));
        }
    }

    public static void B(int i, int i2, int i3, int i4, ty4 ty4) {
        int i5;
        int i6;
        if (i3 > i4) {
            i5 = (int) ((((float) i4) / ((float) i3)) * ((float) i));
            i6 = i;
        } else {
            i6 = (int) ((((float) i3) / ((float) i4)) * ((float) i2));
            i5 = i2;
        }
        ty4.b = i;
        ty4.c = i2;
        ty4.d = i6;
        ty4.e = i5;
    }

    public static final void E(ol4 ol4, Continuation continuation, boolean z) {
        Object takeState$kotlinx_coroutines_core = ol4.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = ol4.getExceptionalResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        Object njc = exceptionalResult$kotlinx_coroutines_core != null ? new njc(exceptionalResult$kotlinx_coroutines_core) : ol4.getSuccessfulResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        if (z) {
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
            Continuation<T> continuation2 = dispatchedContinuation.continuation;
            Object obj = dispatchedContinuation.countOrElement;
            lx3 context = continuation2.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
            z4f G = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? G(continuation2, context, updateThreadContext) : null;
            try {
                dispatchedContinuation.continuation.resumeWith(njc);
            } finally {
                if (G == null || G.H()) {
                    ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                }
            }
        } else {
            continuation.resumeWith(njc);
        }
    }

    public static final um5 F(c6d c6d, m56 m56, m56 m562) {
        return new um5(c6d, new k5d((Object) m56, 6, (Object) m562), o6d.a);
    }

    public static final z4f G(Continuation continuation, lx3 lx3, Object obj) {
        z4f z4f = null;
        if (!(continuation instanceof ux3)) {
            return null;
        }
        if (lx3.get(a5f.a) != null) {
            ux3 ux3 = (ux3) continuation;
            while (true) {
                if (!(ux3 instanceof nl4) && (ux3 = ux3.getCallerFrame()) != null) {
                    if (ux3 instanceof z4f) {
                        z4f = (z4f) ux3;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z4f != null) {
                z4f.I(lx3, obj);
            }
        }
        return z4f;
    }

    public static Object H(a66 a66, Object obj, Continuation continuation) {
        lx3 context = continuation.getContext();
        Object hjc = context == hz4.a ? new hjc(continuation) : new hu3(context, continuation);
        f8.c(2, a66);
        return a66.invoke(obj, hjc);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: bt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: bt0} */
    /* JADX WARNING: type inference failed for: r13v5, types: [yud, java.lang.Object, bt0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(long r21, defpackage.bt0 r23, int r24, java.util.ArrayList r25, int r26, int r27, java.util.ArrayList r28) {
        /*
            r0 = r23
            r1 = r24
            r10 = r25
            r2 = r26
            r11 = r27
            r12 = r28
            r3 = 0
            r4 = 1
            if (r2 >= r11) goto L_0x0012
            r5 = r4
            goto L_0x0013
        L_0x0012:
            r5 = r3
        L_0x0013:
            java.lang.String r6 = "Failed requirement."
            if (r5 == 0) goto L_0x01ca
            r5 = r2
        L_0x0018:
            if (r5 >= r11) goto L_0x0033
            java.lang.Object r7 = r10.get(r5)
            aw0 r7 = (defpackage.aw0) r7
            int r7 = r7.c()
            if (r7 < r1) goto L_0x0029
            int r5 = r5 + 1
            goto L_0x0018
        L_0x0029:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        L_0x0033:
            java.lang.Object r5 = r25.get(r26)
            aw0 r5 = (defpackage.aw0) r5
            int r6 = r11 + -1
            java.lang.Object r6 = r10.get(r6)
            aw0 r6 = (defpackage.aw0) r6
            int r7 = r5.c()
            r13 = -1
            if (r1 != r7) goto L_0x0061
            java.lang.Object r5 = r12.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r2 = r2 + 1
            java.lang.Object r7 = r10.get(r2)
            aw0 r7 = (defpackage.aw0) r7
            r20 = r7
            r7 = r2
            r2 = r5
            r5 = r20
            goto L_0x0063
        L_0x0061:
            r7 = r2
            r2 = r13
        L_0x0063:
            byte r8 = r5.f(r1)
            byte r9 = r6.f(r1)
            r14 = 4
            r15 = 2
            if (r8 == r9) goto L_0x013c
            int r3 = r7 + 1
        L_0x0071:
            if (r3 >= r11) goto L_0x0090
            int r5 = r3 + -1
            java.lang.Object r5 = r10.get(r5)
            aw0 r5 = (defpackage.aw0) r5
            byte r5 = r5.f(r1)
            java.lang.Object r6 = r10.get(r3)
            aw0 r6 = (defpackage.aw0) r6
            byte r6 = r6.f(r1)
            if (r5 == r6) goto L_0x008d
            int r4 = r4 + 1
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0071
        L_0x0090:
            long r5 = r0.b
            long r8 = (long) r14
            long r5 = r5 / r8
            long r5 = r5 + r21
            long r14 = (long) r15
            long r5 = r5 + r14
            int r3 = r4 * 2
            long r14 = (long) r3
            long r14 = r14 + r5
            r0.x0(r4)
            r0.x0(r2)
            r2 = r7
        L_0x00a3:
            if (r2 >= r11) goto L_0x00c7
            java.lang.Object r3 = r10.get(r2)
            aw0 r3 = (defpackage.aw0) r3
            byte r3 = r3.f(r1)
            if (r2 == r7) goto L_0x00bf
            int r4 = r2 + -1
            java.lang.Object r4 = r10.get(r4)
            aw0 r4 = (defpackage.aw0) r4
            byte r4 = r4.f(r1)
            if (r3 == r4) goto L_0x00c4
        L_0x00bf:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.x0(r3)
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00c7:
            bt0 r6 = new bt0
            r6.<init>()
        L_0x00cc:
            if (r7 >= r11) goto L_0x0136
            java.lang.Object r2 = r10.get(r7)
            aw0 r2 = (defpackage.aw0) r2
            byte r2 = r2.f(r1)
            int r3 = r7 + 1
            r4 = r3
        L_0x00db:
            if (r4 >= r11) goto L_0x00ee
            java.lang.Object r5 = r10.get(r4)
            aw0 r5 = (defpackage.aw0) r5
            byte r5 = r5.f(r1)
            if (r2 == r5) goto L_0x00eb
            r5 = r4
            goto L_0x00ef
        L_0x00eb:
            int r4 = r4 + 1
            goto L_0x00db
        L_0x00ee:
            r5 = r11
        L_0x00ef:
            if (r3 != r5) goto L_0x0112
            int r2 = r1 + 1
            java.lang.Object r3 = r10.get(r7)
            aw0 r3 = (defpackage.aw0) r3
            int r3 = r3.c()
            if (r2 != r3) goto L_0x0112
            java.lang.Object r2 = r12.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.x0(r2)
            r17 = r5
            r13 = r6
            r18 = r8
            goto L_0x012f
        L_0x0112:
            long r2 = r6.b
            long r2 = r2 / r8
            long r2 = r2 + r14
            int r2 = (int) r2
            int r2 = r2 * r13
            r0.x0(r2)
            int r16 = r1 + 1
            r2 = r14
            r4 = r6
            r17 = r5
            r5 = r16
            r13 = r6
            r6 = r25
            r18 = r8
            r8 = r17
            r9 = r28
            b(r2, r4, r5, r6, r7, r8, r9)
        L_0x012f:
            r6 = r13
            r7 = r17
            r8 = r18
            r13 = -1
            goto L_0x00cc
        L_0x0136:
            r13 = r6
            r0.t0(r13)
            goto L_0x01c9
        L_0x013c:
            int r4 = r5.c()
            int r8 = r6.c()
            int r4 = java.lang.Math.min(r4, r8)
            r8 = r1
        L_0x0149:
            if (r8 >= r4) goto L_0x015a
            byte r9 = r5.f(r8)
            byte r13 = r6.f(r8)
            if (r9 != r13) goto L_0x015a
            int r3 = r3 + 1
            int r8 = r8 + 1
            goto L_0x0149
        L_0x015a:
            long r8 = r0.b
            long r13 = (long) r14
            long r8 = r8 / r13
            long r8 = r8 + r21
            r17 = r13
            long r13 = (long) r15
            long r8 = r8 + r13
            long r13 = (long) r3
            long r8 = r8 + r13
            r13 = 1
            long r8 = r8 + r13
            int r4 = -r3
            r0.x0(r4)
            r0.x0(r2)
            int r4 = r1 + r3
        L_0x0172:
            if (r1 >= r4) goto L_0x0180
            byte r2 = r5.f(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.x0(r2)
            int r1 = r1 + 1
            goto L_0x0172
        L_0x0180:
            int r1 = r7 + 1
            if (r1 != r11) goto L_0x01aa
            java.lang.Object r1 = r10.get(r7)
            aw0 r1 = (defpackage.aw0) r1
            int r1 = r1.c()
            if (r4 != r1) goto L_0x019e
            java.lang.Object r1 = r12.get(r7)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.x0(r1)
            goto L_0x01c9
        L_0x019e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01aa:
            bt0 r13 = new bt0
            r13.<init>()
            long r1 = r13.b
            long r1 = r1 / r17
            long r1 = r1 + r8
            int r1 = (int) r1
            r2 = -1
            int r1 = r1 * r2
            r0.x0(r1)
            r1 = r8
            r3 = r13
            r5 = r25
            r6 = r7
            r7 = r27
            r8 = r28
            b(r1, r3, r4, r5, r6, r7, r8)
            r0.t0(r13)
        L_0x01c9:
            return
        L_0x01ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3c.b(long, bt0, int, java.util.ArrayList, int, int, java.util.ArrayList):void");
    }

    public static void f(ij3 ij3, zh7 zh7, hj3 hj3) {
        hj3.o = -1;
        hj3.p = -1;
        int i = ij3.p0[0];
        int[] iArr = hj3.p0;
        if (i != 2 && iArr[0] == 4) {
            oi3 oi3 = hj3.I;
            int i2 = oi3.g;
            int q = ij3.q();
            oi3 oi32 = hj3.K;
            int i3 = q - oi32.g;
            oi3.i = zh7.k(oi3);
            oi32.i = zh7.k(oi32);
            zh7.d(oi3.i, i2);
            zh7.d(oi32.i, i3);
            hj3.o = 2;
            hj3.Y = i2;
            int i4 = i3 - i2;
            hj3.U = i4;
            int i5 = hj3.b0;
            if (i4 < i5) {
                hj3.U = i5;
            }
        }
        if (ij3.p0[1] != 2 && iArr[1] == 4) {
            oi3 oi33 = hj3.J;
            int i6 = oi33.g;
            int k = ij3.k();
            oi3 oi34 = hj3.L;
            int i7 = k - oi34.g;
            oi33.i = zh7.k(oi33);
            oi34.i = zh7.k(oi34);
            zh7.d(oi33.i, i6);
            zh7.d(oi34.i, i7);
            if (hj3.a0 > 0 || hj3.g0 == 8) {
                oi3 oi35 = hj3.M;
                sud k2 = zh7.k(oi35);
                oi35.i = k2;
                zh7.d(k2, hj3.a0 + i6);
            }
            hj3.p = 2;
            hj3.Z = i6;
            int i8 = i7 - i6;
            hj3.V = i8;
            int i9 = hj3.c0;
            if (i8 < i9) {
                hj3.V = i9;
            }
        }
    }

    public static final void g(File file) {
        File parentFile;
        if (!file.exists() || !file.canWrite()) {
            File parentFile2 = file.getParentFile();
            if (parentFile2 != null && !parentFile2.exists() && (parentFile = file.getParentFile()) != null && !parentFile.mkdirs()) {
                File absoluteFile = file.getAbsoluteFile();
                throw new IOException("Can't create log file parent dirs=" + absoluteFile);
            } else if (!file.createNewFile()) {
                throw new IOException(wg0.i("Can't create log file=", file.getAbsolutePath()));
            } else if (!file.canWrite()) {
                throw new IOException(wg0.i("Can't write to file=", file.getAbsolutePath()));
            }
        }
    }

    public static void h(int i, Collection collection) {
        boolean contains = collection.contains(Integer.valueOf(i));
        Locale locale = Locale.US;
        String o = o(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(o(((Integer) it.next()).intValue()));
        }
        c54.j(k7d.j("Effects target ", o, " is not in the supported list ", "[" + String.join(", ", arrayList) + "]", "."), contains);
    }

    public static final void i(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            j47.e(th, th2);
        }
    }

    public static Continuation j(a66 a66, Object obj, Continuation continuation) {
        if (a66 instanceof gi0) {
            return ((gi0) a66).n(obj, continuation);
        }
        lx3 context = continuation.getContext();
        return context == hz4.a ? new k47(a66, obj, continuation) : new l47(continuation, context, a66, obj);
    }

    public static final boolean k(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final lx3 m(lx3 lx3, lx3 lx32, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) lx3.fold(bool, new ai0(11))).booleanValue();
        boolean booleanValue2 = ((Boolean) lx32.fold(bool, new ai0(11))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return lx3.plus(lx32);
        }
        hz4 hz4 = hz4.a;
        lx3 lx33 = (lx3) lx3.fold(hz4, new ai0(12));
        Object obj = lx32;
        if (booleanValue2) {
            obj = lx32.fold(hz4, new ai0(13));
        }
        return lx33.plus((lx3) obj);
    }

    public static Drawable n(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static String o(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static final String p(View view) {
        Object obj;
        try {
            obj = view.getResources().getResourceName(view.getId());
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (pjc.a(obj) != null) {
            obj = view.getClass().getName();
        }
        return (String) obj;
    }

    public static SharedPreferences q(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final ArrayList r(ww0 ww0) {
        String str;
        try {
            ArrayList arrayList = new ArrayList(1);
            if (ww0.b()) {
                str = ww0.c();
            } else {
                byte[] bytes = ww0.c().getBytes(Charset.forName("UTF-8"));
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bytes, 0, bytes.length);
                str = Base64.encodeToString(instance.digest(), 11);
            }
            arrayList.add(str);
            return arrayList;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static wnc s(ma6 ma6) {
        if (ma6.p == null) {
            ma6.p = new wnc();
        }
        return ma6.p;
    }

    public static fm9 t(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return ssc.r;
            case 1:
                return ssc.q;
            case 2:
                return ssc.o;
            case 3:
                return ssc.p;
            case 4:
                return ssc.k;
            case 5:
                return ssc.m;
            case 6:
                return ssc.l;
            case 7:
                return ssc.s;
            case 8:
                return ssc.n;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static Continuation u(Continuation continuation) {
        hu3 hu3 = continuation instanceof hu3 ? (hu3) continuation : null;
        if (hu3 != null && (continuation = hu3.c) == null) {
            iu3 iu3 = (iu3) hu3.getContext().get(vu4.b);
            if (iu3 == null || (continuation = iu3.interceptContinuation(hu3)) == null) {
                continuation = hu3;
            }
            hu3.c = continuation;
        }
        return continuation;
    }

    public static final boolean v(int i) {
        return i == 1 || i == 2;
    }

    public static final String w(uu3 uu3) {
        String name = uu3.getClass().getName();
        int hashCode = uu3.hashCode();
        return name + "@" + hashCode;
    }

    public static final lx3 x(sx3 sx3, lx3 lx3) {
        lx3 m = m(sx3.getCoroutineContext(), lx3, true);
        jd4 jd4 = ql4.a;
        return (m == jd4 || m.get(vu4.b) != null) ? m : m.plus(jd4);
    }

    public static final void y(c66 c66, View view) {
        Object tag = view.getTag(vxb.oneme_theme_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            String p = p(view);
            hm9.m0("ViewThemeUtils", "try to observe onThemeChanged more than once for " + p, new Object[0]);
            return;
        }
        fpf fpf = new fpf(c66, view);
        view.setTag(vxb.oneme_theme_attach_listener, fpf);
        if (view.isAttachedToWindow()) {
            fpf.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(fpf);
    }

    public static void z(Context context, l20 l20, kk5 kk5) {
        File h = kk5.h(l20);
        if (h.exists()) {
            String q = tfg.q(l20.j.c);
            if ("application/vnd.android.package-archive".equals(q)) {
                try {
                    if (context.getPackageManager().canRequestPackageInstalls()) {
                        nd7.Q(new nm(context, 1));
                    }
                } catch (SecurityException e) {
                    hm9.p("v3c", "fail to install apk", e);
                    if (e.toString().contains("REQUEST_INSTALL_PACKAGES")) {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.setDataAndType(kk5.f(context, h), q);
                        context.startActivity(intent);
                    }
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(1);
                intent2.setDataAndType(kk5.f(context, h), q != null ? q : "*/*");
                if (q != null) {
                    try {
                        context.startActivity(intent2);
                    } catch (Exception unused) {
                        intent2.setDataAndType(kk5.f(context, h), "*/*");
                        context.startActivity(intent2);
                    }
                } else {
                    context.startActivity(intent2);
                }
            }
        } else {
            throw new FileNotFoundException("attach file not found");
        }
    }

    public abstract void C(j1 j1Var, j1 j1Var2);

    public abstract void D(j1 j1Var, Thread thread);

    public abstract boolean c(l1 l1Var, w0 w0Var, w0 w0Var2);

    public abstract boolean d(l1 l1Var, Object obj, Object obj2);

    public abstract boolean e(l1 l1Var, j1 j1Var, j1 j1Var2);

    public abstract void l(Rect rect, Rect rect2);
}
