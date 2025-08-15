package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: xxc  reason: default package */
public final class xxc implements b66, s43, kz3, ed6, wn0, kxd {
    public static final xxc X = new Object();
    public static final xxc Y = new Object();
    public static final xxc Z = new Object();
    public static final xxc a = new Object();
    public static final ci b = new Object();
    public static final /* synthetic */ xxc c = new Object();
    public static final we1 o = new we1(25);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
        r0 = r2.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r0 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        r0 = r0.getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r0.equals("libcore.io.GaiException") != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        throw new java.net.UnknownHostException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0006, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0007, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0008, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0009, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.net.HttpURLConnection r2) {
        /*
            r2.connect()     // Catch:{ SecurityException -> 0x000a, IllegalArgumentException -> 0x0008, NullPointerException -> 0x0006, all -> 0x0004 }
            return
        L_0x0004:
            r2 = move-exception
            throw r2
        L_0x0006:
            r2 = move-exception
            throw r2
        L_0x0008:
            r2 = move-exception
            throw r2
        L_0x000a:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L_0x0030
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "libcore.io.GaiException"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = "android.system.GaiException"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            throw r2
        L_0x002a:
            java.net.UnknownHostException r2 = new java.net.UnknownHostException
            r2.<init>()
            throw r2
        L_0x0030:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxc.g(java.net.HttpURLConnection):void");
    }

    public static LinearLayout i(Context context, List list, m56 m56) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tt3 tt3 = (tt3) it.next();
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setOnClickListener(new tb((Object) m56, 25, (Object) tt3));
            Integer num = tt3.d;
            pq9 pq9 = qp4.u0;
            if (num != null) {
                int intValue = num.intValue();
                ImageView imageView = new ImageView(frameLayout.getContext());
                imageView.setImageResource(intValue);
                Integer num2 = tt3.e;
                if (num2 != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(pq9.j(imageView).c(num2.intValue())));
                }
                float f = (float) 24;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388627;
                layoutParams.setMarginStart(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
                frameLayout.addView(imageView, layoutParams);
                v3c.y(new c3(tt3, imageView, (Continuation) null, 10), frameLayout);
            }
            TextView textView = new TextView(frameLayout.getContext());
            i4f.l.b(textView, du4.b);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(pq9.j(textView).getText().e);
            textView.setText(tt3.b.b(textView.getContext()));
            Integer num3 = tt3.c;
            if (num3 != null) {
                textView.setTextColor(pq9.j(textView).c(num3.intValue()));
            }
            v3c.y(new xh0((Object) tt3, (Continuation) null, 7), textView);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388627;
            layoutParams2.setMarginStart(tu0.G((tt3.d != null ? (float) 44 : (float) 4) * fk4.d().getDisplayMetrics().density));
            layoutParams2.setMarginEnd(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
            float f2 = (float) 12;
            layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            layoutParams2.bottomMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
            frameLayout.addView(textView, layoutParams2);
            linearLayout.addView(frameLayout, -1, -2);
        }
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream, tp6, java.util.zip.DeflaterOutputStream] */
    public static rq6 k(a8g a8g) {
        BufferedOutputStream bufferedOutputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) a8g.b).openConnection();
        Iterator it = ((zs) a8g.c).iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                lq6 lq6 = (lq6) u1Var.next();
                httpURLConnection.setRequestProperty(lq6.a, lq6.b);
            } else {
                try {
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new IOException(e);
                } catch (IOException e2) {
                    httpURLConnection.disconnect();
                    throw e2;
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            }
        }
        httpURLConnection.setRequestMethod((String) a8g.a);
        pkg pkg = (pkg) a8g.o;
        if (pkg != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setChunkedStreamingMode(0);
        }
        g(httpURLConnection);
        if (pkg != null) {
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            fl flVar = (fl) pkg.a;
            boolean shouldGzip = flVar.shouldGzip();
            int i = pkg.b;
            wk wkVar = (wk) pkg.c;
            up6 up6 = (up6) pkg.o;
            if (shouldGzip) {
                ? gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                up6.b.f(gZIPOutputStream, flVar, wkVar, i);
                gZIPOutputStream.finish();
                gZIPOutputStream.m();
            } else {
                up6.b.f(bufferedOutputStream, flVar, wkVar, i);
            }
            bufferedOutputStream.close();
        }
        ArrayList arrayList = new ArrayList();
        int responseCode = httpURLConnection.getResponseCode();
        for (String next : httpURLConnection.getHeaderFields().keySet()) {
            if (next != null) {
                arrayList.add(new lq6(next, httpURLConnection.getHeaderField(next)));
            }
        }
        return new rq6(responseCode, new zs(1, (lq6[]) arrayList.toArray(new lq6[0])), new k36(2, httpURLConnection), 1);
    }

    public static mg4 l(xxc xxc, Integer num) {
        mg4 mg4;
        mg4 mg42 = mg4.REGULAR;
        xxc.getClass();
        byte byteValue = num.byteValue();
        mg4[] values = mg4.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                mg4 = null;
                break;
            }
            mg4 = values[i];
            if (mg4.a == byteValue) {
                break;
            }
            i++;
        }
        return mg4 == null ? mg42 : mg4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        defpackage.v3c.i(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m(java.lang.Throwable r4) {
        /*
            java.lang.String r0 = "\n"
            if (r4 != 0) goto L_0x0007
            java.lang.String r4 = ""
            return r4
        L_0x0007:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x003b }
            r1.<init>()     // Catch:{ all -> 0x003b }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x003b }
            r2.<init>(r1)     // Catch:{ all -> 0x003b }
            r4.printStackTrace(r2)     // Catch:{ all -> 0x0034 }
            r2.flush()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0034 }
            java.lang.CharSequence r1 = defpackage.w9e.b1(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0034 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r3.<init>(r0)     // Catch:{ all -> 0x0034 }
            r3.append(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0034 }
            r1 = 0
            defpackage.v3c.i(r2, r1)     // Catch:{ all -> 0x003b }
            goto L_0x0049
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            defpackage.v3c.i(r2, r0)     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\ncould not get stacktrace from error: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxc.m(java.lang.Throwable):java.lang.String");
    }

    public boolean a(int i) {
        return false;
    }

    public Object apply(Object obj) {
        List list = (List) obj;
        return list.isEmpty() ? m28.a : f28.e(list);
    }

    public o43 b() {
        return null;
    }

    public void c(int i, o43 o43) {
    }

    public void clear() {
    }

    public void d(int i, o43 o43) {
    }

    public o43 e() {
        return null;
    }

    public o43 f(int i) {
        return null;
    }

    public long j(long j) {
        return j;
    }

    public gle w(gy8 gy8) {
        int i;
        String str;
        if (!gy8.m()) {
            return null;
        }
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        Long l = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("timestamp")) {
                    long j = 0;
                    try {
                        j = lz7.M(gy8, 0);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int s3 = au1.s(k7d.a);
                        if (s3 != 0) {
                            if (s3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                    l = Long.valueOf(j);
                } else {
                    try {
                        gy8.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int s4 = au1.s(k7d.a);
                        if (s4 != 0) {
                            if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new fgc(l);
    }
}
