package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.CancellationSignal;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* renamed from: h7b  reason: default package */
public final class h7b implements a76, tk6, Provider, gq1 {
    public static final String[] o = {"name", "length", "last_touch_timestamp"};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public h7b(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new HashSet();
                this.c = new bkb(2);
                return;
            case 13:
                this.b = new HashMap();
                this.c = new ArrayList();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.b = new HashSet();
                return;
            case LangUtils.HASH_SEED /*17*/:
                q0e a2 = r0e.a((Object) null);
                this.b = a2;
                this.c = new w7c(a2);
                return;
            case 18:
                this.b = new CountDownLatch(1);
                this.c = new AtomicReference();
                return;
            case 21:
                this.b = new HashMap();
                return;
            default:
                this.b = new Rect();
                this.c = new Rect();
                return;
        }
    }

    public static boolean r(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            ta5.n("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            ta5.n("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: mpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: qt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: mpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: mpd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.a
            switch(r1) {
                case 5: goto L_0x0026;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r18
            java.lang.Void r1 = (java.lang.Void) r1
            java.lang.Object r1 = r0.c
            fu1 r1 = (defpackage.fu1) r1
            l0f r2 = r1.A0
            int r2 = r2.b
            r3 = 2
            if (r2 != r3) goto L_0x0025
            int r1 = r1.S0
            r2 = 9
            if (r1 != r2) goto L_0x0025
            java.lang.Object r0 = r0.c
            fu1 r0 = (defpackage.fu1) r0
            r1 = 10
            r0.F(r1)
        L_0x0025:
            return
        L_0x0026:
            r1 = r18
            f17 r1 = (defpackage.f17) r1
            java.lang.Object r2 = r0.c
            e70 r2 = (defpackage.e70) r2
            boolean r3 = r2.i
            if (r3 == 0) goto L_0x0134
            z05 r3 = r2.l
            java.lang.Object r0 = r0.b
            z05 r0 = (defpackage.z05) r0
            if (r3 == r0) goto L_0x003c
            goto L_0x0134
        L_0x003c:
            boolean r0 = r2.o
            r4 = 0
            r6 = 0
            mpd r7 = r2.e
            qt0 r8 = r2.d
            if (r0 == 0) goto L_0x0075
            long r9 = r2.p
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = r6
        L_0x0050:
            r9 = 0
            defpackage.c54.p(r9, r0)
            long r10 = java.lang.System.nanoTime()
            long r12 = r2.p
            long r10 = r10 - r12
            long r12 = r2.f
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0075
            boolean r0 = r2.o
            defpackage.c54.p(r9, r0)
            r8.start()     // Catch:{ AudioStream$AudioStreamException -> 0x006f }
            r7.stop()     // Catch:{ AudioStream$AudioStreamException -> 0x006f }
            r2.o = r6     // Catch:{ AudioStream$AudioStreamException -> 0x006f }
            goto L_0x0075
        L_0x006f:
            long r9 = java.lang.System.nanoTime()
            r2.p = r9
        L_0x0075:
            boolean r0 = r2.o
            if (r0 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r7 = r8
        L_0x007b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            java.lang.String r8 = "The buffer is submitted or canceled."
            if (r0 != 0) goto L_0x012e
            java.nio.ByteBuffer r0 = r1.c
            q90 r7 = r7.read(r0)
            int r9 = r7.a
            if (r9 <= 0) goto L_0x0127
            boolean r10 = r2.r
            if (r10 == 0) goto L_0x00b2
            byte[] r10 = r2.s
            if (r10 == 0) goto L_0x009a
            int r10 = r10.length
            if (r10 >= r9) goto L_0x009e
        L_0x009a:
            byte[] r10 = new byte[r9]
            r2.s = r10
        L_0x009e:
            int r10 = r0.position()
            byte[] r11 = r2.s
            r0.put(r11, r6, r9)
            int r11 = r0.position()
            java.nio.Buffer r11 = r0.limit(r11)
            r11.position(r10)
        L_0x00b2:
            java.util.concurrent.Executor r10 = r2.j
            long r11 = r7.b
            if (r10 == 0) goto L_0x00fb
            long r13 = r2.u
            long r13 = r11 - r13
            r15 = 200(0xc8, double:9.9E-322)
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x00fb
            r2.u = r11
            l7b r7 = r2.k
            int r13 = r2.v
            r14 = 2
            if (r13 != r14) goto L_0x00fb
            java.nio.ShortBuffer r13 = r0.asShortBuffer()
            r14 = 0
        L_0x00d1:
            boolean r16 = r13.hasRemaining()
            if (r16 == 0) goto L_0x00e7
            short r16 = r13.get()
            int r3 = java.lang.Math.abs(r16)
            double r4 = (double) r3
            double r14 = java.lang.Math.max(r14, r4)
            r4 = 0
            goto L_0x00d1
        L_0x00e7:
            r3 = 4674736138332667904(0x40dfffc000000000, double:32767.0)
            double r14 = r14 / r3
            r2.t = r14
            if (r7 == 0) goto L_0x00fb
            c r3 = new c
            r4 = 11
            r3.<init>(r2, r4, r7)
            r10.execute(r3)
        L_0x00fb:
            int r3 = r0.position()
            int r3 = r3 + r9
            r0.limit(r3)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = r0.toMicros(r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0121
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0118
            r6 = 1
        L_0x0118:
            defpackage.c54.k(r6)
            r1.g = r3
            r1.b()
            goto L_0x012a
        L_0x0121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0127:
            r1.a()
        L_0x012a:
            r2.c()
            goto L_0x0137
        L_0x012e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0134:
            r1.a()
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7b.a(java.lang.Object):void");
    }

    public uc0 b(CharSequence charSequence, Long l) {
        if (charSequence == null) {
            charSequence = "";
        }
        return oag.a(String.valueOf(new iqe(charSequence).b((Context) this.b)), l);
    }

    public iqe c(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c37.D(charSequence.toString()));
        spannableStringBuilder.setSpan(new mse(qp4.u0.b((Context) this.b).i(), new ma1(this, 1)), 0, spannableStringBuilder.length(), 17);
        return new iqe(spannableStringBuilder);
    }

    public void d(Throwable th) {
        fad fad;
        switch (this.a) {
            case 5:
                e70 e70 = (e70) this.c;
                if (e70.l == ((z05) this.b) && !(th instanceof IllegalStateException)) {
                    Executor executor = e70.j;
                    l7b l7b = e70.k;
                    if (executor != null && l7b != null) {
                        executor.execute(new c(l7b, 8, th));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (th instanceof DeferrableSurface$SurfaceClosedException) {
                    xf4 xf4 = ((DeferrableSurface$SurfaceClosedException) th).a;
                    Iterator it = ((fu1) this.c).a.n().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            fad = (fad) it.next();
                            if (fad.b().contains(xf4)) {
                            }
                        } else {
                            fad = null;
                        }
                    }
                    if (fad != null) {
                        fu1 fu1 = (fu1) this.c;
                        fu1.getClass();
                        zh6 D = ju0.D();
                        dad dad = fad.f;
                        if (dad != null) {
                            new Throwable();
                            fu1.toString();
                            D.execute(new wt1(dad, 3, fad));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (th instanceof CancellationException) {
                    ((fu1) this.c).toString();
                    return;
                } else {
                    if (((fu1) this.c).S0 == 9) {
                        ((fu1) this.c).E(9, new v90(th, 4), true);
                    }
                    Objects.toString((fu1) this.c);
                    fu1 fu12 = (fu1) this.c;
                    if (fu12.w0 == ((sz1) this.b)) {
                        fu12.D();
                        return;
                    }
                    return;
                }
            default:
                ((un9) this.c).getClass();
                hf5 hf5 = (hf5) this.b;
                hab a2 = hf5.a();
                eab eab = hf5.b;
                a2.d(eab, "NetworkFetchProducer", th, (Map) null);
                hf5.a().e(eab, "NetworkFetchProducer", false);
                ((oj0) eab).h("network", "default");
                hf5.a.e(th);
                return;
        }
    }

    public void e(Object obj, String str) {
        obj.getClass();
        ((HashMap) this.b).put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public sh0 f() {
        Object obj = new Object();
        Context context = (Context) this.b;
        sh0 sh0 = (sh0) this.c;
        return new sh0(3, (Object) new edc[]{obj, new jn(context, sh0), new nd2(16), new Object(), new Object(), new y7g((Object) context, 10, (Object) sh0)});
    }

    public Bitmap g(int i) {
        Object obj;
        bkb bkb = (bkb) this.c;
        synchronized (bkb) {
            qs0 qs0 = (qs0) ((SparseArray) bkb.a).get(i);
            if (qs0 == null) {
                obj = null;
            } else {
                obj = qs0.c.pollFirst();
                if (((qs0) bkb.b) != qs0) {
                    bkb.t(qs0);
                    qs0 qs02 = (qs0) bkb.b;
                    if (qs02 == null) {
                        bkb.b = qs0;
                        bkb.c = qs0;
                    } else {
                        qs0.d = qs02;
                        qs02.a = qs0;
                        bkb.b = qs0;
                    }
                }
            }
        }
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(obj);
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || !r(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    public Object get() {
        return new g99((Context) ((Provider) this.b).get(), (iz3) ((Provider) this.c).get());
    }

    public HashMap h() {
        Cursor query;
        try {
            ((String) this.c).getClass();
            query = ((e34) this.b).getReadableDatabase().query((String) this.c, o, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            HashMap hashMap = new HashMap(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(0);
                string.getClass();
                hashMap.put(string, new rw0(query.getLong(1), query.getLong(2)));
            }
            query.close();
            return hashMap;
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public sk6 i() {
        return new lt2((khe) ((je7) this.b), ((v4) this.c).d(yu2.class));
    }

    public Long j(String str) {
        xlc a2 = xlc.a(1, "SELECT long_value FROM Preference where `key`=?");
        a2.f(1, str);
        ilc ilc = (ilc) this.b;
        ilc.b();
        Long l = null;
        Cursor o2 = ilc.o(a2, (CancellationSignal) null);
        try {
            if (o2.moveToFirst()) {
                if (!o2.isNull(0)) {
                    l = Long.valueOf(o2.getLong(0));
                }
            }
            return l;
        } finally {
            o2.close();
            a2.n();
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, h37, j37] */
    public Integer k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!(bigInteger2 == null || bigInteger == null)) {
            BigInteger bigInteger3 = (BigInteger) this.b;
            BigInteger bigInteger4 = (BigInteger) this.c;
            this.b = bigInteger;
            this.c = bigInteger2;
            if (!(bigInteger3 == null || bigInteger4 == null)) {
                if (bigInteger3.compareTo(bigInteger) > 0 || bigInteger4.compareTo(bigInteger2) > 0) {
                    this.b = null;
                    this.c = null;
                } else {
                    BigInteger subtract = bigInteger.subtract(bigInteger3);
                    BigInteger subtract2 = bigInteger2.subtract(bigInteger4);
                    if (subtract.compareTo(BigInteger.ZERO) <= 0) {
                        return null;
                    }
                    int floatValue = (int) ((subtract2.floatValue() * ((float) 100)) / subtract.floatValue());
                    ? h37 = new h37(0, 100, 1);
                    if (!h37.isEmpty()) {
                        Integer num = 0;
                        if (floatValue < num.intValue()) {
                            Integer num2 = 0;
                            floatValue = num2.intValue();
                        } else {
                            int i = h37.b;
                            if (floatValue > Integer.valueOf(i).intValue()) {
                                floatValue = Integer.valueOf(i).intValue();
                            }
                        }
                        return Integer.valueOf(floatValue);
                    }
                    throw new IllegalArgumentException("Cannot coerce value to an empty range: " + h37 + '.');
                }
            }
        }
        return null;
    }

    public synchronized Map l() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (Map) this.c;
    }

    public void m(b8c b8c, yic yic) {
        ((ry1) this.b).resumeWith(yic);
    }

    public void n(String str) {
        djb djb;
        boolean z;
        if (str != null && !w9e.C0(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject("commands");
                if (optJSONObject != null && (djb = (djb) this.c) != null) {
                    long optLong = optJSONObject.optLong("globalShutdownMs");
                    Long valueOf = Long.valueOf(optJSONObject.optLong("featureShutdownMs"));
                    String str2 = (String) this.b;
                    if (str2 == null) {
                        valueOf = null;
                    }
                    optJSONObject.optLong("tagShutdownMs");
                    SharedPreferences.Editor edit = djb.h().edit();
                    boolean z2 = true;
                    if (optLong > 0) {
                        edit.putLong("system.shutdown.until.ts", System.currentTimeMillis() + optLong);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (str2 == null || valueOf == null || valueOf.longValue() <= 0) {
                        z2 = z;
                    } else {
                        edit.putLong(zr6.i("system.", str2, ".shutdown.until.ts"), valueOf.longValue() + System.currentTimeMillis());
                    }
                    if (z2) {
                        edit.apply();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public void o(long j) {
        SQLiteDatabase writableDatabase;
        e34 e34 = (e34) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (hcf.a(e34.getReadableDatabase(), 2, hexString) != 1) {
                writableDatabase = e34.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                hcf.b(writableDatabase, 2, hexString, 1);
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void p(g7b g7b) {
        ilc ilc = (ilc) this.b;
        ilc.b();
        ilc.c();
        try {
            ((sh) this.c).C(g7b);
            ilc.r();
        } finally {
            ilc.l();
        }
    }

    public void q(b8c b8c, IOException iOException) {
        ry1 ry1 = (ry1) this.b;
        if (!ry1.isCancelled()) {
            IOException iOException2 = (IOException) this.c;
            if (iOException2 != null) {
                iOException2.initCause(iOException);
            }
            if (iOException2 != null) {
                iOException = iOException2;
            }
            ry1.resumeWith(new njc(iOException));
        }
    }

    public void s(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        zw6 j = zw6.j(hashSet);
        hashSet.clear();
        ls5 l = j.listIterator(0);
        while (l.hasNext()) {
            w94 w94 = (w94) l.next();
            w94.getClass();
            w94.j(exc, z ? 1 : 3);
        }
    }

    public void t(InputStream inputStream, int i) {
        rq8 rq8;
        f46.I();
        un9 un9 = (un9) this.c;
        y7g y7g = (y7g) un9.b;
        if (i > 0) {
            y7g.getClass();
            rq8 = new rq8((pq8) y7g.b, i);
        } else {
            y7g.getClass();
            rq8 = new rq8((pq8) y7g.b);
        }
        ja6 ja6 = (ja6) un9.c;
        byte[] bArr = (byte[]) ja6.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                hf5 hf5 = (hf5) this.b;
                if (read < 0) {
                    ((mr0) un9.d).P(hf5);
                    un9.c(rq8, hf5);
                    ja6.e(bArr);
                    rq8.close();
                    f46.I();
                    return;
                } else if (read > 0) {
                    rq8.write(bArr, 0, read);
                    un9.d(rq8, hf5);
                    int i2 = rq8.c;
                    hf5.a.i(i > 0 ? ((float) i2) / ((float) i) : 1.0f - ((float) Math.exp(((double) (-i2)) / 50000.0d)));
                }
            } catch (Throwable th) {
                ja6.e(bArr);
                rq8.close();
                throw th;
            }
        }
    }

    public Object u() {
        Object obj;
        bkb bkb = (bkb) this.c;
        synchronized (bkb) {
            qs0 qs0 = (qs0) bkb.c;
            if (qs0 == null) {
                obj = null;
            } else {
                Object pollLast = qs0.c.pollLast();
                if (qs0.c.isEmpty()) {
                    bkb.t(qs0);
                    ((SparseArray) bkb.a).remove(qs0.b);
                }
                obj = pollLast;
            }
        }
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(obj);
            }
        }
        return obj;
    }

    public void v(Set set) {
        SQLiteDatabase writableDatabase;
        ((String) this.c).getClass();
        try {
            writableDatabase = ((e34) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void w(w4d w4d, ey3 ey3, om8 om8) {
        String str;
        rod rod = (rod) ((k56) this.c).invoke();
        if (rod == null) {
            om8.invoke(new IllegalStateException("Signaling is not ready or released"));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "get-participant-list-chunk");
        jSONObject.put(NewHtcHomeBadger.COUNT, 0);
        int i = kc6.$EnumSwitchMapping$0[au1.s(1)];
        if (i == 1) {
            str = "GRID";
        } else if (i == 2) {
            str = "SIDE";
        } else if (i == 3) {
            str = "ADMIN";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        jSONObject.put("listType", (Object) str);
        zad zad = (zad) w4d.b;
        if (zad instanceof yad) {
            jSONObject.put("roomId", ((yad) zad).a);
        }
        rod.j(jSONObject, new dy0(this, w4d, om8, ey3), new nt(this, om8, 5));
    }

    public void x(long j, String str, long j2) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((e34) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, (String) null, contentValues);
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public xy y() {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                String valueOf = String.valueOf(file);
                new StringBuilder(String.valueOf(file2).length() + valueOf.length() + 37);
            }
        }
        try {
            return new xy(file, 0);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 16);
                sb.append("Couldn't create ");
                sb.append(valueOf2);
                throw new IOException(sb.toString(), e);
            }
            try {
                return new xy(file, 0);
            } catch (FileNotFoundException e2) {
                String valueOf3 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf3.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(valueOf3);
                throw new IOException(sb2.toString(), e2);
            }
        }
    }

    public void z(int i) {
        q0e q0e = (q0e) this.b;
        uy8 uy8 = (uy8) q0e.getValue();
        int i2 = 0;
        if (i == 4) {
            if ((uy8 != null ? uy8.a : 0) != 2) {
                return;
            }
        }
        if (i == 0) {
            if (uy8 != null) {
                i2 = uy8.a;
            }
            i = i2 == 2 ? 3 : 2;
        }
        q0e.m((Object) null, new uy8(i));
    }

    public /* synthetic */ h7b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ h7b(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ h7b(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ h7b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public h7b(va8 va8) {
        this.a = 12;
        this.b = (String) va8.c;
        this.c = (djb) va8.b;
    }

    public h7b(int i, int i2, ColorSpace colorSpace) {
        this.a = 22;
        this.b = colorSpace;
        this.c = (i == -1 || i2 == -1) ? null : new kpa(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public h7b(WorkDatabase workDatabase) {
        this.a = 0;
        this.b = workDatabase;
        this.c = new sh(workDatabase, 16);
    }

    public h7b(Context context, int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = context;
                this.c = tu0.r(3, new x5(28, this));
                return;
            case 16:
                this.b = context;
                sh0 sh0 = new sh0(0, (byte) 0);
                this.c = sh0;
                sh0.z(context.getApplicationInfo().sourceDir);
                return;
            default:
                this.b = context.getApplicationContext();
                this.c = "ActivityThemer";
                return;
        }
    }

    public h7b(File file) {
        this.a = 4;
        this.b = file;
        this.c = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public h7b(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 14;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
}
