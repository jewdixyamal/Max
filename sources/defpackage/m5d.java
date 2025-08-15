package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Icon;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.widget.RemoteViews;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.nano.Protos;

/* renamed from: m5d  reason: default package */
public final class m5d implements ox0, sya, o05, v3d, gq1 {
    public static final String[] Y = {"id", "key", "metadata"};
    public Object X;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ m5d(int i) {
        this.a = i;
    }

    public static void u(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder o2 = rh4.o(str, ": EGL error: 0x");
            o2.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(o2.toString());
        }
    }

    public h99 A(String str) {
        if (!((ConcurrentHashMap) this.X).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.X).containsKey(str)) {
                        InputStream a2 = ((o99) this.b).a(str);
                        ((p99) this.c).getClass();
                        for (ova e : p99.a(a2)) {
                            ((h99) this.o).e(e);
                        }
                        ((ConcurrentHashMap) this.X).put(str, str);
                    }
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    throw new IllegalStateException("Failed to read file " + str, e2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (h99) this.o;
    }

    public cd6 B(oh8 oh8) {
        ah3 ah3;
        synchronized (this.b) {
            ah3 = (ah3) ((us) this.o).get(oh8);
        }
        if (ah3 != null) {
            return ah3.b;
        }
        return null;
    }

    public void C(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.b;
        str.getClass();
        hcf.b(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.X;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.X) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object D(long r27, java.lang.String r29, defpackage.kv0 r30, defpackage.fv0 r31, kotlin.coroutines.Continuation r32) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = r32
            boolean r4 = r3 instanceof defpackage.l5d
            if (r4 == 0) goto L_0x0019
            r4 = r3
            l5d r4 = (defpackage.l5d) r4
            int r5 = r4.w0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0019
            int r5 = r5 - r6
            r4.w0 = r5
            goto L_0x001e
        L_0x0019:
            l5d r4 = new l5d
            r4.<init>(r0, r3)
        L_0x001e:
            java.lang.Object r3 = r4.u0
            tx3 r5 = defpackage.tx3.a
            int r6 = r4.w0
            e5f r7 = defpackage.e5f.a
            r8 = 0
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L_0x0056
            if (r6 == r10) goto L_0x0048
            if (r6 != r9) goto L_0x0040
            long r0 = r4.t0
            cu8 r2 = r4.s0
            fv0 r5 = r4.Z
            kv0 r6 = r4.Y
            java.lang.String r9 = r4.X
            m5d r4 = r4.o
            defpackage.od2.a0(r3)
            goto L_0x00c1
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            long r0 = r4.t0
            fv0 r2 = r4.Z
            kv0 r6 = r4.Y
            java.lang.String r11 = r4.X
            m5d r12 = r4.o
            defpackage.od2.a0(r3)
            goto L_0x0087
        L_0x0056:
            defpackage.od2.a0(r3)
            java.lang.Object r3 = r0.X
            je7 r3 = (defpackage.je7) r3
            java.lang.Object r3 = r3.getValue()
            r79 r3 = (defpackage.r79) r3
            r4.o = r0
            r6 = r29
            r4.X = r6
            r11 = r30
            r4.Y = r11
            r12 = r31
            r4.Z = r12
            r4.t0 = r1
            r4.w0 = r10
            java.lang.Object r3 = r3.a(r1, r4)
            if (r3 != r5) goto L_0x007c
            return r5
        L_0x007c:
            r24 = r12
            r12 = r0
            r0 = r1
            r2 = r24
            r25 = r11
            r11 = r6
            r6 = r25
        L_0x0087:
            cu8 r3 = (defpackage.cu8) r3
            if (r6 == 0) goto L_0x014a
            if (r3 != 0) goto L_0x008f
            goto L_0x014a
        L_0x008f:
            java.lang.Object r10 = r12.X
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            r79 r10 = (defpackage.r79) r10
            k5d r13 = new k5d
            r14 = 0
            r13.<init>((java.lang.Object) r11, (int) r14, (java.lang.Object) r6)
            r4.o = r12
            r4.X = r11
            r4.Y = r6
            r4.Z = r2
            r4.s0 = r3
            r4.t0 = r0
            r4.w0 = r9
            r10.getClass()
            wp r4 = new wp
            r4.<init>((defpackage.m56) r13, (defpackage.r79) r10)
            vlc r9 = r10.a
            r9.n(r0, r4)
            if (r7 != r5) goto L_0x00bd
            return r5
        L_0x00bd:
            r5 = r2
            r2 = r3
            r9 = r11
            r4 = r12
        L_0x00c1:
            java.lang.Object r3 = r4.o
            je7 r3 = (defpackage.je7) r3
            java.lang.Object r3 = r3.getValue()
            av0 r3 = (defpackage.av0) r3
            l6f r10 = new l6f
            long r11 = r2.t0
            long r13 = r2.b
            r2 = 0
            r26 = r10
            r27 = r11
            r29 = r13
            r31 = r2
            r26.<init>(r27, r29, r31)
            r3.c(r10)
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x00e9
            goto L_0x010f
        L_0x00e9:
            boolean r10 = r3.c()
            if (r10 == 0) goto L_0x010f
            us7 r10 = defpackage.us7.X
            java.lang.String r11 = r5.X
            java.lang.String r12 = "Msg keyboard, sendCallback: callbackId:"
            java.lang.String r13 = "|payload:"
            java.lang.String r14 = "|msgId:"
            java.lang.StringBuilder r11 = defpackage.k7d.k(r12, r9, r13, r11, r14)
            r11.append(r0)
            java.lang.String r12 = "|btnP:"
            r11.append(r12)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            r3.d(r10, r2, r11, r8)
        L_0x010f:
            java.lang.Object r2 = r4.c
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            pk r2 = (defpackage.pk) r2
            java.lang.String r3 = r5.X
            nv0 r4 = r5.b
            k4a r2 = (defpackage.k4a) r2
            boolean r5 = r2.p(r0)
            if (r5 != 0) goto L_0x0126
            goto L_0x0149
        L_0x0126:
            kf9 r5 = new kf9
            m7b r8 = r2.y()
            p7b r8 = (defpackage.p7b) r8
            t33 r8 = r8.a
            long r14 = r8.o()
            long r18 = java.lang.System.currentTimeMillis()
            r13 = r5
            r16 = r9
            r17 = r3
            r20 = r0
            r22 = r6
            r23 = r4
            r13.<init>(r14, r16, r17, r18, r20, r22, r23)
            defpackage.k4a.w(r2, r5)
        L_0x0149:
            return r7
        L_0x014a:
            java.lang.Object r0 = r12.b
            java.lang.String r0 = (java.lang.String) r0
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x0153
            goto L_0x0178
        L_0x0153:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0178
            us7 r2 = defpackage.us7.Z
            if (r3 == 0) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r10 = 0
        L_0x015f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Msg keyboard, fail sendCallback btnP:"
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = "|msgExist:"
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r8)
        L_0x0178:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5d.D(long, java.lang.String, kv0, fv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean E(oh8 oh8) {
        boolean z;
        synchronized (this.b) {
            z = ((us) this.o).get(oh8) != null;
        }
        return z;
    }

    public boolean F(String str) {
        String str2 = (String) this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = (String) this.o;
            if (str3 == null) {
                this.o = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (((HashSet) this.X) == null) {
                    HashSet hashSet = new HashSet(16);
                    this.X = hashSet;
                    hashSet.add((String) this.b);
                    ((HashSet) this.X).add((String) this.o);
                }
                return !((HashSet) this.X).add(str);
            }
        }
    }

    public boolean G(oh8 oh8, int i) {
        ah3 ah3;
        synchronized (this.b) {
            ah3 = (ah3) ((us) this.o).get(oh8);
        }
        ii8 ii8 = (ii8) ((WeakReference) this.X).get();
        return ah3 != null && ah3.e.a(i) && ii8 != null && ii8.s.s().a(i);
    }

    public boolean H(oh8 oh8, int i) {
        ah3 ah3;
        synchronized (this.b) {
            ah3 = (ah3) ((us) this.o).get(oh8);
        }
        return ah3 != null && ah3.d.a(i);
    }

    public boolean I(oh8 oh8, y9d y9d) {
        ah3 ah3;
        synchronized (this.b) {
            ah3 = (ah3) ((us) this.o).get(oh8);
        }
        if (ah3 != null) {
            z9d z9d = ah3.d;
            z9d.getClass();
            y9d.getClass();
            if (z9d.a.contains(y9d)) {
                return true;
            }
        }
        return false;
    }

    public void J(RecyclerView recyclerView) {
        recyclerView.setImportantForAccessibility(2);
        this.o = new iof(1, this);
        ViewPager2 viewPager2 = (ViewPager2) this.X;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    public void K() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) this.o);
            EGL14.eglDestroyContext((EGLDisplay) this.b, (EGLContext) this.c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.b);
        }
        ((Surface) this.X).release();
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.o = EGL14.EGL_NO_SURFACE;
        this.X = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1.b.k();
        r4 = (defpackage.ii8) ((java.lang.ref.WeakReference) r4.X).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r4.i() == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        defpackage.oaf.W(r4.l, new defpackage.wg3(r4, r5, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L(defpackage.oh8 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            java.lang.Object r1 = r4.o     // Catch:{ all -> 0x0011 }
            us r1 = (defpackage.us) r1     // Catch:{ all -> 0x0011 }
            java.lang.Object r1 = r1.remove(r5)     // Catch:{ all -> 0x0011 }
            ah3 r1 = (defpackage.ah3) r1     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r4 = move-exception
            goto L_0x0041
        L_0x0013:
            java.lang.Object r2 = r4.c     // Catch:{ all -> 0x0011 }
            us r2 = (defpackage.us) r2     // Catch:{ all -> 0x0011 }
            java.lang.Object r3 = r1.a     // Catch:{ all -> 0x0011 }
            r2.remove(r3)     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            cd6 r0 = r1.b
            r0.k()
            java.lang.Object r4 = r4.X
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            ii8 r4 = (defpackage.ii8) r4
            if (r4 == 0) goto L_0x0040
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x0035
            goto L_0x0040
        L_0x0035:
            android.os.Handler r0 = r4.l
            wg3 r1 = new wg3
            r2 = 0
            r1.<init>(r4, r5, r2)
            defpackage.oaf.W(r0, r1)
        L_0x0040:
            return
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5d.L(oh8):void");
    }

    public void M() {
        int j;
        int i = 16908360;
        ViewPager2 viewPager2 = (ViewPager2) this.X;
        zmf.h(viewPager2, 16908360);
        boolean z = false;
        zmf.e(viewPager2, 0);
        zmf.h(viewPager2, 16908361);
        zmf.e(viewPager2, 0);
        zmf.h(viewPager2, 16908358);
        zmf.e(viewPager2, 0);
        zmf.h(viewPager2, 16908359);
        zmf.e(viewPager2, 0);
        if (viewPager2.getAdapter() != null && (j = viewPager2.getAdapter().j()) != 0 && viewPager2.F0) {
            int orientation = viewPager2.getOrientation();
            oof oof = (oof) this.c;
            nof nof = (nof) this.b;
            if (orientation == 0) {
                if (viewPager2.u0.H() == 1) {
                    z = true;
                }
                int i2 = z ? 16908360 : 16908361;
                if (z) {
                    i = 16908361;
                }
                if (viewPager2.o < j - 1) {
                    zmf.i(viewPager2, new f4(i2), nof);
                }
                if (viewPager2.o > 0) {
                    zmf.i(viewPager2, new f4(i), oof);
                    return;
                }
                return;
            }
            if (viewPager2.o < j - 1) {
                zmf.i(viewPager2, new f4(16908359), nof);
            }
            if (viewPager2.o > 0) {
                zmf.i(viewPager2, new f4(16908358), oof);
            }
        }
    }

    public void a(HashMap hashMap) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = ((e34) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            C(writableDatabase);
            for (mx0 r : hashMap.values()) {
                r(writableDatabase, r);
            }
            writableDatabase.setTransactionSuccessful();
            ((SparseArray) this.o).clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void b(EncodeException encodeException) {
        if (((adc) this.X).W == null) {
            ((tj3) this.c).accept(encodeException);
        }
    }

    public void c(mx0 mx0, boolean z) {
        SparseArray sparseArray = (SparseArray) this.o;
        int i = mx0.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, (Object) null);
        }
    }

    public void d() {
        ((lq1) this.b).b((Object) null);
    }

    public void e(mx0 mx0) {
        ((SparseArray) this.o).put(mx0.a, mx0);
    }

    public boolean f() {
        try {
            SQLiteDatabase readableDatabase = ((e34) this.c).getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            return hcf.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public mn5 g(long j) {
        Object obj;
        Iterator it = ((Set) ((AtomicReference) ((x3c) this.b).Y).get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((gza) obj).a == j) {
                break;
            }
        }
        gza gza = (gza) obj;
        lz4 lz4 = lz4.a;
        if (gza == null) {
            return lz4;
        }
        int ordinal = gza.b.ordinal();
        if (ordinal == 0) {
            return ((sya) this.X).g(j);
        }
        if (ordinal != 1) {
            return lz4;
        }
        return od2.M(new t03(((ds3) ((je7) this.c).getValue()).c(((hyc) ((q33) ((je7) this.o).getValue())).t() ^ j), 11), new eza(j, (Continuation) null));
    }

    public void h(HashMap hashMap) {
        SQLiteDatabase writableDatabase;
        SparseArray sparseArray = (SparseArray) this.o;
        if (sparseArray.size() != 0) {
            try {
                writableDatabase = ((e34) this.c).getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    mx0 mx0 = (mx0) sparseArray.valueAt(i);
                    if (mx0 == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = (String) this.X;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        r(writableDatabase, mx0);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }
    }

    public void i(long j) {
        String hexString = Long.toHexString(j);
        this.b = hexString;
        this.X = wg0.i("ExoPlayerCacheIndex", hexString);
    }

    public void j(d05 d05) {
        adc adc = (adc) this.X;
        if (adc.f0 != 3) {
            MediaMuxer mediaMuxer = adc.C;
            nb0 nb0 = (nb0) this.o;
            if (mediaMuxer == null) {
                if (!adc.r) {
                    adc.V.f(new et0(d05));
                    if (adc.U != null) {
                        adc.C(nb0);
                    }
                }
                d05.close();
                return;
            }
            try {
                adc.J(d05, nb0);
                d05.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            d05.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        throw th;
    }

    public void k(HashMap hashMap, SparseArray sparseArray) {
        Cursor query;
        SQLiteDatabase writableDatabase;
        e34 e34 = (e34) this.c;
        fm9.k(((SparseArray) this.o).size() == 0);
        try {
            SQLiteDatabase readableDatabase = e34.getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            if (hcf.a(readableDatabase, 1, str) != 1) {
                writableDatabase = e34.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                C(writableDatabase);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            SQLiteDatabase readableDatabase2 = e34.getReadableDatabase();
            String str2 = (String) this.X;
            str2.getClass();
            query = readableDatabase2.query(str2, Y, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                int i = query.getInt(0);
                String string = query.getString(1);
                string.getClass();
                hashMap.put(string, new mx0(i, string, bwf.c(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                sparseArray.put(i, string);
            }
            query.close();
            return;
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new IOException(e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        throw th;
    }

    public void l() {
        SQLiteDatabase writableDatabase;
        e34 e34 = (e34) this.c;
        String str = (String) this.b;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            writableDatabase = e34.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            int i = hcf.a;
            if (oaf.f0(writableDatabase, "ExoPlayerVersions")) {
                writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
            }
            writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new IOException(e);
        } catch (SQLException e2) {
            throw new IOException(e2);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public void m(b8c b8c, yic yic) {
        ble ble = (ble) this.X;
        h7b h7b = (h7b) this.c;
        ((w2a) this.b).e = SystemClock.elapsedRealtime();
        i8c i8c = yic.Z;
        try {
            if (!yic.m()) {
                ad b2 = ((y8a) vl.b()).b();
                int i = yic.o;
                if (!b2.a().c()) {
                    b2.g("HTTP_ERROR", String.valueOf(i));
                }
                IOException iOException = new IOException("Unexpected HTTP code " + yic);
                ble.getClass();
                if (b8c.x0) {
                    ((un9) h7b.c).getClass();
                    hf5 hf5 = (hf5) h7b.b;
                    hf5.a().k(hf5.b, "NetworkFetchProducer");
                    hf5.a.c();
                } else {
                    h7b.d(iOException);
                }
                if (i8c != null) {
                    try {
                        i8c.close();
                    } catch (Exception e) {
                        ta5.k(e);
                    }
                }
            } else {
                long n = i8c.n();
                if (n < 0) {
                    n = 0;
                }
                h7b.t(i8c.m(), (int) n);
                try {
                    i8c.close();
                } catch (Exception e2) {
                    ta5.k(e2);
                }
            }
        } catch (Exception e3) {
            ble.getClass();
            if (b8c.x0) {
                ((un9) h7b.c).getClass();
                hf5 hf52 = (hf5) h7b.b;
                hf52.a().k(hf52.b, "NetworkFetchProducer");
                hf52.a.c();
            } else {
                h7b.d(e3);
            }
            if (i8c != null) {
                i8c.close();
            }
        } catch (Throwable th) {
            if (i8c != null) {
                try {
                    i8c.close();
                } catch (Exception e4) {
                    ta5.k(e4);
                }
            }
            throw th;
        }
    }

    public void n(q64 q64) {
        ((adc) this.X).I = q64;
    }

    public void o(nt9 nt9) {
        IconCompat a2 = nt9.a();
        Icon icon = null;
        if (a2 != null) {
            icon = cs6.d(a2, (Context) null);
        }
        Notification.Action.Builder a3 = wu9.a(icon, nt9.i, nt9.j);
        vfc[] vfcArr = nt9.c;
        if (vfcArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[vfcArr.length];
            for (int i = 0; i < vfcArr.length; i++) {
                remoteInputArr[i] = vfc.a(vfcArr[i]);
            }
            for (RemoteInput c2 : remoteInputArr) {
                uu9.c(a3, c2);
            }
        }
        Bundle bundle = nt9.a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z = nt9.d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i2 = Build.VERSION.SDK_INT;
        xu9.a(a3, z);
        int i3 = nt9.f;
        bundle2.putInt("android.support.action.semanticAction", i3);
        zu9.b(a3, i3);
        av9.c(a3, nt9.g);
        if (i2 >= 31) {
            bv9.a(a3, nt9.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", nt9.e);
        uu9.b(a3, bundle2);
        uu9.a((Notification.Builder) this.c, uu9.d(a3));
    }

    public void p(Object obj, oh8 oh8, z9d z9d, k3b k3b) {
        synchronized (this.b) {
            try {
                oh8 z = z(obj);
                if (z == null) {
                    ((us) this.c).put(obj, oh8);
                    ((us) this.o).put(oh8, new ah3(obj, new cd6(), z9d, k3b));
                } else {
                    ah3 ah3 = (ah3) ((us) this.o).get(z);
                    fm9.l(ah3);
                    ah3.d = z9d;
                    ah3.e = k3b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(b8c b8c, IOException iOException) {
        ad b2 = ((y8a) vl.b()).b();
        if (!b2.a().c()) {
            b2.g("HTTP_ERROR", iOException.getClass().getSimpleName());
        }
        if (iOException.getMessage() == null || iOException.getMessage().toLowerCase().equals("canceled")) {
            hm9.r("OkHttpNetworkFetchProducer", iOException, "onFailure for request %s", (mhc) this.o);
        }
        h7b h7b = (h7b) this.c;
        ((ble) this.X).getClass();
        if (b8c.x0) {
            ((un9) h7b.c).getClass();
            hf5 hf5 = (hf5) h7b.b;
            hf5.a().k(hf5.b, "NetworkFetchProducer");
            hf5.a.c();
            return;
        }
        h7b.d(iOException);
    }

    public void r(SQLiteDatabase sQLiteDatabase, mx0 mx0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bwf.d(mx0.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(mx0.a));
        contentValues.put("key", mx0.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.X;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, (String) null, contentValues);
    }

    public void s(oh8 oh8, int i, zg3 zg3) {
        synchronized (this.b) {
            try {
                ah3 ah3 = (ah3) ((us) this.o).get(oh8);
                if (ah3 != null) {
                    k3b k3b = ah3.g;
                    k3b.getClass();
                    rm5 rm5 = new rm5(1);
                    rm5.b(k3b.a);
                    rm5.a(i);
                    ah3.g = new k3b(rm5.e());
                    ah3.c.add(zg3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a8g t() {
        try {
            return new a8g(this);
        } finally {
            o43.S((o43) this.o);
            this.o = null;
            o43.U((ArrayList) this.X);
            this.X = null;
        }
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return "Pack{incomingAudio=" + ((List) this.b) + ", incomingVideo=" + ((List) this.c) + ", outgoingAudio=" + ((List) this.o) + ", outgoingVideo=" + ((List) this.X) + '}';
            default:
                return super.toString();
        }
    }

    public void v(ah3 ah3) {
        ii8 ii8 = (ii8) ((WeakReference) this.X).get();
        if (ii8 != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                zg3 zg3 = (zg3) ah3.c.poll();
                if (zg3 == null) {
                    ah3.f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                oaf.W(ii8.l, new vs5(ii8, z(ah3.a), new vq1(this, zg3, atomicBoolean2, ah3, atomicBoolean, 2), 19));
                atomicBoolean2.set(false);
            }
        }
    }

    public void w(oh8 oh8) {
        synchronized (this.b) {
            try {
                ah3 ah3 = (ah3) ((us) this.o).get(oh8);
                if (ah3 != null) {
                    k3b k3b = ah3.g;
                    ah3.g = k3b.b;
                    ah3.c.add(new xg3(this, oh8, k3b));
                    if (!ah3.f) {
                        ah3.f = true;
                        v(ah3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k3b x(oh8 oh8) {
        synchronized (this.b) {
            try {
                ah3 ah3 = (ah3) ((us) this.o).get(oh8);
                if (ah3 == null) {
                    return null;
                }
                k3b k3b = ah3.e;
                return k3b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zw6 y() {
        zw6 j;
        synchronized (this.b) {
            j = zw6.j(((us) this.c).values());
        }
        return j;
    }

    public oh8 z(Object obj) {
        oh8 oh8;
        synchronized (this.b) {
            oh8 = (oh8) ((us) this.c).get(obj);
        }
        return oh8;
    }

    public /* synthetic */ m5d(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ m5d(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    public /* synthetic */ m5d(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public m5d(kq7 kq7) {
        this.a = 17;
        this.X = kq7;
        this.c = new Handler(Looper.getMainLooper());
        this.o = new gwe(8, (Object) this);
    }

    public m5d(x3c x3c, xs2 xs2, je7 je7, je7 je72) {
        this.a = 11;
        this.b = x3c;
        this.X = xs2;
        this.c = je7;
        this.o = je72;
    }

    public m5d(je7 je7, je7 je72, je7 je73) {
        this.a = 0;
        this.b = m5d.class.getName();
        this.c = je7;
        this.o = je72;
        this.X = je73;
    }

    public m5d(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = 5;
        this.c = je7;
        this.o = je72;
        this.X = je73;
        this.b = je74;
    }

    public m5d(o99 o99, p99 p99, qc3 qc3) {
        this.a = 4;
        this.b = o99;
        this.c = p99;
        this.o = qc3;
        this.X = new ConcurrentHashMap();
    }

    public m5d(ii8 ii8) {
        this.a = 7;
        this.c = new qpd();
        this.o = new qpd();
        this.b = new Object();
        this.X = new WeakReference(ii8);
    }

    public m5d(bu9 bu9) {
        Icon icon;
        int i;
        Bundle bundle;
        ArrayList arrayList;
        Bundle[] bundleArr;
        nt9 nt9;
        nt9 nt92;
        m5d m5d = this;
        bu9 bu92 = bu9;
        m5d.a = 10;
        new ArrayList();
        m5d.X = new Bundle();
        m5d.o = bu92;
        Context context = bu92.a;
        m5d.b = context;
        Notification.Builder a2 = yu9.a(context, bu92.z);
        m5d.c = a2;
        Notification notification = bu92.F;
        Bundle[] bundleArr2 = null;
        int i2 = 2;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(bu92.e).setContentText(bu92.f).setContentInfo((CharSequence) null).setContentIntent(bu92.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(bu92.h, (notification.flags & 128) != 0).setNumber(bu92.j).setProgress(bu92.o, bu92.p, bu92.q);
        IconCompat iconCompat = bu92.i;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = cs6.d(iconCompat, context);
        }
        wu9.b(a2, icon);
        a2.setSubText((CharSequence) null).setUsesChronometer(bu92.m).setPriority(bu92.k);
        pu9 pu9 = bu92.n;
        if (pu9 instanceof gu9) {
            gu9 gu9 = (gu9) pu9;
            int i3 = uub.ic_call_decline;
            PendingIntent pendingIntent = gu9.h;
            if (pendingIntent == null) {
                nt9 = gu9.p(i3, r0c.call_notification_hang_up_action, ctb.call_notification_decline_color, gu9.i);
            } else {
                nt9 = gu9.p(i3, r0c.call_notification_decline_action, ctb.call_notification_decline_color, pendingIntent);
            }
            int i4 = uub.ic_call_answer;
            PendingIntent pendingIntent2 = gu9.g;
            if (pendingIntent2 == null) {
                nt92 = null;
            } else {
                nt92 = gu9.p(i4, r0c.call_notification_answer_action, ctb.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(nt9);
            ArrayList arrayList3 = ((bu9) gu9.b).b;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    nt9 nt93 = (nt9) it.next();
                    if (nt93.g) {
                        arrayList2.add(nt93);
                    } else if (!nt93.a.getBoolean("key_action_priority") && i2 > 1) {
                        arrayList2.add(nt93);
                        i2--;
                    }
                    if (nt92 != null && i2 == 1) {
                        arrayList2.add(nt92);
                        i2--;
                    }
                }
            }
            if (nt92 != null && i2 >= 1) {
                arrayList2.add(nt92);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                m5d.o((nt9) it2.next());
            }
        } else {
            Iterator it3 = bu92.b.iterator();
            while (it3.hasNext()) {
                m5d.o((nt9) it3.next());
            }
        }
        Bundle bundle2 = bu92.w;
        if (bundle2 != null) {
            ((Bundle) m5d.X).putAll(bundle2);
        }
        ((Notification.Builder) m5d.c).setShowWhen(bu92.l);
        uu9.i((Notification.Builder) m5d.c, bu92.u);
        uu9.g((Notification.Builder) m5d.c, bu92.r);
        uu9.j((Notification.Builder) m5d.c, bu92.t);
        uu9.h((Notification.Builder) m5d.c, bu92.s);
        vu9.b((Notification.Builder) m5d.c, bu92.v);
        vu9.c((Notification.Builder) m5d.c, bu92.x);
        vu9.f((Notification.Builder) m5d.c, bu92.y);
        vu9.d((Notification.Builder) m5d.c, (Notification) null);
        vu9.e((Notification.Builder) m5d.c, notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = bu92.G;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                vu9.a((Notification.Builder) m5d.c, (String) it4.next());
            }
        }
        ArrayList arrayList5 = bu92.d;
        if (arrayList5.size() > 0) {
            if (bu92.w == null) {
                bu92.w = new Bundle();
            }
            Bundle bundle3 = bu92.w.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList5.size()) {
                String num = Integer.toString(i5);
                nt9 nt94 = (nt9) arrayList5.get(i5);
                Bundle bundle6 = new Bundle();
                IconCompat a3 = nt94.a();
                bundle6.putInt("icon", a3 != null ? a3.e() : 0);
                bundle6.putCharSequence("title", nt94.i);
                bundle6.putParcelable("actionIntent", nt94.j);
                Bundle bundle7 = nt94.a;
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", nt94.d);
                bundle6.putBundle("extras", bundle);
                vfc[] vfcArr = nt94.c;
                if (vfcArr == null) {
                    arrayList = arrayList5;
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[vfcArr.length];
                    int i6 = 0;
                    while (i6 < vfcArr.length) {
                        vfc vfc = vfcArr[i6];
                        ArrayList arrayList6 = arrayList5;
                        Bundle bundle8 = new Bundle();
                        vfc[] vfcArr2 = vfcArr;
                        bundle8.putString("resultKey", vfc.a);
                        bundle8.putCharSequence("label", vfc.b);
                        bundle8.putCharSequenceArray("choices", vfc.c);
                        bundle8.putBoolean("allowFreeFormInput", vfc.d);
                        bundle8.putBundle("extras", vfc.f);
                        Set<String> set = vfc.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList arrayList7 = new ArrayList(set.size());
                            for (String add : set) {
                                arrayList7.add(add);
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList7);
                        }
                        bundleArr[i6] = bundle8;
                        i6++;
                        arrayList5 = arrayList6;
                        vfcArr = vfcArr2;
                    }
                    arrayList = arrayList5;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", nt94.e);
                bundle6.putInt("semanticAction", nt94.f);
                bundle5.putBundle(num, bundle6);
                i5++;
                bundleArr2 = null;
                arrayList5 = arrayList;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (bu92.w == null) {
                bu92.w = new Bundle();
            }
            bu92.w.putBundle("android.car.EXTENSIONS", bundle3);
            m5d = this;
            ((Bundle) m5d.X).putBundle("android.car.EXTENSIONS", bundle4);
        }
        ((Notification.Builder) m5d.c).setExtras(bu92.w);
        xu9.e((Notification.Builder) m5d.c, (CharSequence[]) null);
        yu9.b((Notification.Builder) m5d.c, bu92.A);
        yu9.e((Notification.Builder) m5d.c, (CharSequence) null);
        yu9.f((Notification.Builder) m5d.c, bu92.B);
        yu9.g((Notification.Builder) m5d.c, 0);
        yu9.d((Notification.Builder) m5d.c, bu92.C);
        if (!TextUtils.isEmpty(bu92.z)) {
            ((Notification.Builder) m5d.c).setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        Iterator it5 = bu92.c.iterator();
        while (it5.hasNext()) {
            kua kua = (kua) it5.next();
            kua.getClass();
            zu9.a((Notification.Builder) m5d.c, jua.b(kua));
        }
        int i7 = Build.VERSION.SDK_INT;
        av9.a((Notification.Builder) m5d.c, bu92.E);
        av9.b((Notification.Builder) m5d.c, (Notification.BubbleMetadata) null);
        if (i7 >= 31 && (i = bu92.D) != 0) {
            bv9.b((Notification.Builder) m5d.c, i);
        }
    }

    public m5d() {
        this.a = 6;
        this.c = null;
        this.o = new ArrayList();
        this.X = null;
        this.b = "";
    }

    public m5d(e34 e34) {
        this.a = 1;
        this.c = e34;
        this.o = new SparseArray();
    }

    public m5d(ViewPager2 viewPager2) {
        this.a = 16;
        this.X = viewPager2;
        this.b = new nof(this);
        this.c = new oof(this);
    }
}
