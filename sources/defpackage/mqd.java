package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSocket;
import one.me.android.concurrent.SingleCoreActivity;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: mqd  reason: default package */
public abstract class mqd {
    public static boolean a = false;
    public static final qq9 b = new Object();
    public static final String[] c = {"_id", "lookup"};
    public static final String[] d = {"contact_id", "mimetype", "data2", "data3", "data5", "_id", "data1", "display_name", "photo_uri"};
    public static int e = 3;

    public static PorterDuff.Mode A(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return PorterDuff.Mode.MULTIPLY;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final w4d D() {
        w4d w4d = new w4d(10, false);
        w4d.b = new AtomicReference((Object) null);
        return w4d;
    }

    public static u3f E(u3f u3f, String[] strArr, Map map) {
        int i = 0;
        if (u3f == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (u3f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                u3f u3f2 = new u3f();
                int length = strArr.length;
                while (i < length) {
                    u3f2.a((u3f) map.get(strArr[i]));
                    i++;
                }
                return u3f2;
            }
        } else if (strArr != null && strArr.length == 1) {
            u3f.a((u3f) map.get(strArr[0]));
            return u3f;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                u3f.a((u3f) map.get(strArr[i]));
                i++;
            }
        }
        return u3f;
    }

    public static final List F(List list, int i, int i2) {
        nz4 nz4;
        while (true) {
            nz4 = nz4.a;
            if (i < 0 || i > y53.L(list)) {
                return nz4;
            }
            if (i2 == 0) {
                Object j0 = x53.j0(i, list);
                return j0 != null ? Collections.singletonList(j0) : nz4;
            } else if (i2 > 0) {
                int i3 = i2 + i;
                if (i3 > list.size()) {
                    i3 = list.size();
                }
                try {
                    return list.subList(i, i3);
                } catch (Throwable unused) {
                    return nz4;
                }
            } else {
                int i4 = i2 + i;
                if (i4 < 0) {
                    i4 = 0;
                }
                int i5 = i4;
                i2 = i;
                i = i5;
            }
        }
        return nz4;
    }

    public static void G(Status status, Object obj, qne qne) {
        if (status.a <= 0) {
            qne.b(obj);
        } else {
            qne.a(i24.k(status));
        }
    }

    public static void H(List list, a7b a7b, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (a7b.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final tad I(kl1 kl1) {
        bg1 bg1 = kl1.f;
        Long l = kl1.g;
        return new tad(kl1.e, bg1, kl1.a, l, kl1.b, kl1.d, kl1.c);
    }

    public static final void J(y5f y5f) {
        y5f.e(t50.class, new cl(9));
    }

    public static final void K(y5f y5f) {
        y5f.e(u8e.class, new td3(20));
        y5f.e(ay6.class, new td3(21));
        y5f.e(up.class, new td3(22));
        y5f.e(pk4.class, new zq3(19));
        y5f.e(me6.class, new cl(27));
        y5f.e(oe6.class, new cl(28));
        y5f.e(cud.class, new cl(29));
    }

    public static void L(File file, ej5 ej5) {
        ej5.j(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    L(file2, ej5);
                } else {
                    ej5.f(file2);
                }
            }
        }
        ej5.m(file);
    }

    public static final String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            new ArrayList().add("");
            if (mr0.Y(buc.z(0, str, 0, 7, false)) != null) {
                return str;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        } catch (Throwable th) {
            hm9.p("ServerPrefs", "validate host failure", th);
            str = null;
        }
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean f(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File f : listFiles) {
                f(f);
            }
        }
        return file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int g(defpackage.anc r17, defpackage.jic r18, defpackage.g05 r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            boolean r2 = defpackage.g05.U(r19)
            r3 = 1
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            boolean r2 = defpackage.g05.U(r19)
            java.lang.String r4 = "Check failed."
            if (r2 == 0) goto L_0x011a
            if (r0 == 0) goto L_0x00a3
            int r2 = r0.b
            if (r2 <= 0) goto L_0x00a3
            int r5 = r0.a
            if (r5 <= 0) goto L_0x00a3
            r19.o0()
            int r6 = r1.Y
            if (r6 == 0) goto L_0x00a3
            r19.o0()
            int r6 = r1.Z
            if (r6 != 0) goto L_0x002e
            goto L_0x00a3
        L_0x002e:
            r17.getClass()
            r19.o0()
            int r6 = r1.o
            r7 = 270(0x10e, float:3.78E-43)
            r8 = 90
            if (r6 == 0) goto L_0x004f
            if (r6 == r8) goto L_0x004f
            r9 = 180(0xb4, float:2.52E-43)
            if (r6 == r9) goto L_0x004f
            if (r6 != r7) goto L_0x0045
            goto L_0x004f
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x004f:
            if (r6 == r8) goto L_0x0056
            if (r6 != r7) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r4 = 0
            goto L_0x0057
        L_0x0056:
            r4 = r3
        L_0x0057:
            if (r4 == 0) goto L_0x005f
            r19.o0()
            int r6 = r1.Z
            goto L_0x0064
        L_0x005f:
            r19.o0()
            int r6 = r1.Y
        L_0x0064:
            if (r4 == 0) goto L_0x006c
            r19.o0()
            int r4 = r1.Y
            goto L_0x0071
        L_0x006c:
            r19.o0()
            int r4 = r1.Z
        L_0x0071:
            float r7 = (float) r5
            float r8 = (float) r6
            float r7 = r7 / r8
            float r8 = (float) r2
            float r9 = (float) r4
            float r8 = r8 / r9
            float r9 = defpackage.ote.b(r7, r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            java.lang.Float r14 = java.lang.Float.valueOf(r7)
            java.lang.Float r15 = java.lang.Float.valueOf(r8)
            java.lang.Float r16 = java.lang.Float.valueOf(r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r11, r12, r13, r14, r15, r16}
            java.lang.String r4 = "DownsampleUtil"
            java.lang.String r5 = "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f"
            defpackage.ta5.h(r4, r5, r2)
            goto L_0x00a5
        L_0x00a3:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x00a5:
            r19.o0()
            ou6 r2 = r1.c
            ou6 r4 = defpackage.qb4.a
            r5 = 2
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = 1059760811(0x3f2aaaab, float:0.6666667)
            if (r2 != r4) goto L_0x00cd
            int r2 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bc
            goto L_0x00e8
        L_0x00bc:
            r3 = r5
        L_0x00bd:
            int r2 = r3 * 2
            double r4 = (double) r2
            double r4 = r7 / r4
            double r10 = (double) r6
            double r10 = r10 * r4
            double r10 = r10 + r4
            double r4 = (double) r9
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00cb
            goto L_0x00e8
        L_0x00cb:
            r3 = r2
            goto L_0x00bd
        L_0x00cd:
            int r2 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d2
            goto L_0x00e8
        L_0x00d2:
            double r10 = (double) r5
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = java.lang.Math.pow(r10, r12)
            double r12 = r12 - r10
            double r12 = r7 / r12
            double r10 = r7 / r10
            double r14 = (double) r6
            double r12 = r12 * r14
            double r12 = r12 + r10
            double r10 = (double) r9
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x0115
            int r3 = r5 + -1
        L_0x00e8:
            r19.o0()
            int r2 = r1.Z
            r19.o0()
            int r4 = r1.Y
            int r2 = java.lang.Math.max(r2, r4)
            if (r0 == 0) goto L_0x00fb
            float r0 = r0.c
            goto L_0x00fe
        L_0x00fb:
            r10 = r20
            float r0 = (float) r10
        L_0x00fe:
            int r4 = r2 / r3
            float r4 = (float) r4
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0114
            r19.o0()
            ou6 r4 = r1.c
            ou6 r5 = defpackage.qb4.a
            if (r4 != r5) goto L_0x0111
            int r3 = r3 * 2
            goto L_0x00fe
        L_0x0111:
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x0114:
            return r3
        L_0x0115:
            r10 = r20
            int r5 = r5 + 1
            goto L_0x00d2
        L_0x011a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.g(anc, jic, g05, int):int");
    }

    public static float h(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static String i(SSLSocket sSLSocket, String str) {
        try {
            Certificate[] peerCertificates = sSLSocket.getSession().getPeerCertificates();
            int length = peerCertificates.length;
            StringBuilder sb = new StringBuilder("host=" + str + ", certificates(" + length + ")=\n");
            int length2 = peerCertificates.length;
            int i = 0;
            int i2 = 0;
            while (i < length2) {
                Certificate certificate = peerCertificates[i];
                sb.append("#" + i2 + " " + certificate + "\n");
                i++;
                i2++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "failed to retrieve certificates, host=".concat(str);
        }
    }

    public static ViewGroup j(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static y7f k(View view) {
        ViewGroup j = j(view);
        if (j == null) {
            return null;
        }
        return new y7f(j);
    }

    public static Object l(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static Object m(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object n(ArrayList arrayList) {
        Object obj = null;
        if (arrayList instanceof Collection) {
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList instanceof List) {
                return wg0.f(arrayList, 1);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            do {
                obj = it.next();
            } while (it.hasNext());
        }
        return obj;
    }

    public static Object o(ffc ffc) {
        ls5 l = ffc.listIterator(0);
        Object next = l.next();
        if (!l.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && l.hasNext(); i++) {
            sb.append(", ");
            sb.append(l.next());
        }
        if (l.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [vua, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v10, types: [java.lang.Object, cva] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e5, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r14 = r6;
        r2 = r16;
        r3 = r19;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
        r22 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a8, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ae, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01af, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b7, code lost:
        r16 = r2;
        r19 = r5;
        r1 = r13;
        r14 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Collection p(android.content.Context r24, defpackage.o45 r25) {
        /*
            java.lang.String r2 = "loadPhonebook failed"
            java.lang.String r0 = "/photo"
            java.lang.String r3 = "vnd.android.cursor.item/name"
            java.lang.String r4 = "vnd.android.cursor.item/phone_v2"
            java.lang.String r5 = "mqd"
            android.content.ContentResolver r6 = r24.getContentResolver()
            if (r6 != 0) goto L_0x0015
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0015:
            wv7 r12 = new wv7
            r12.<init>()
            wv7 r13 = new wv7
            r13.<init>()
            java.lang.String r9 = "mimetype IN (?, ?)"
            java.lang.String[] r10 = new java.lang.String[]{r4, r3}     // Catch:{ Exception -> 0x01ca, all -> 0x01c6 }
            android.net.Uri r7 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String[] r8 = d     // Catch:{ Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String r11 = "display_name ASC"
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01ca, all -> 0x01c6 }
            if (r6 == 0) goto L_0x01b2
            java.lang.String r7 = "_id"
            int r7 = r6.getColumnIndex(r7)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r8 = "mimetype"
            int r8 = r6.getColumnIndex(r8)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r9 = "contact_id"
            int r9 = r6.getColumnIndex(r9)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r10 = "display_name"
            int r10 = r6.getColumnIndex(r10)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r11 = "data1"
            int r11 = r6.getColumnIndex(r11)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r1 = "photo_uri"
            int r1 = r6.getColumnIndex(r1)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r15 = "data2"
            int r15 = r6.getColumnIndex(r15)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            java.lang.String r14 = "data3"
            int r14 = r6.getColumnIndex(r14)     // Catch:{ Exception -> 0x01b6, all -> 0x00ad }
            r16 = r2
            java.lang.String r2 = "data5"
            int r2 = r6.getColumnIndex(r2)     // Catch:{ Exception -> 0x01ae, all -> 0x00ad }
        L_0x0069:
            boolean r17 = r6.moveToNext()     // Catch:{ Exception -> 0x01ae, all -> 0x00ad }
            if (r17 == 0) goto L_0x01b2
            r18 = r14
            r17 = r15
            long r14 = r6.getLong(r9)     // Catch:{ Exception -> 0x01ae, all -> 0x00ad }
            r19 = r5
            java.lang.String r5 = r6.getString(r8)     // Catch:{ Exception -> 0x01ab, all -> 0x00ad }
            java.lang.Object r20 = r13.c(r14)     // Catch:{ Exception -> 0x01ab, all -> 0x00ad }
            cva r20 = (defpackage.cva) r20     // Catch:{ Exception -> 0x01ab, all -> 0x00ad }
            if (r20 != 0) goto L_0x00b3
            r21 = r8
            cva r8 = new cva     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            r8.<init>()     // Catch:{ Exception -> 0x00af, all -> 0x00ad }
            r22 = r13
            r13 = 0
            r8.a = r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.b = r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.c = r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r13 = 0
            r8.d = r13     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r23 = r2
            r13 = r3
            r2 = 0
            r8.e = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x009f:
            r2 = 0
            goto L_0x00bd
        L_0x00a1:
            r14 = r6
            goto L_0x0282
        L_0x00a4:
            r14 = r6
            r2 = r16
            r3 = r19
            r1 = r22
            goto L_0x01d3
        L_0x00ad:
            r0 = move-exception
            goto L_0x00a1
        L_0x00af:
            r0 = move-exception
            r22 = r13
            goto L_0x00a4
        L_0x00b3:
            r23 = r2
            r21 = r8
            r22 = r13
            r13 = r3
            r8 = r20
            goto L_0x009f
        L_0x00bd:
            r8.a = r2     // Catch:{ Exception -> 0x01a7, all -> 0x00ad }
            r8.b = r2     // Catch:{ Exception -> 0x01a7, all -> 0x00ad }
            boolean r3 = r4.equals(r5)     // Catch:{ Exception -> 0x01a7, all -> 0x00ad }
            if (r3 == 0) goto L_0x0131
            java.lang.String r3 = r6.getString(r11)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            boolean r5 = defpackage.oag.t(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r5 == 0) goto L_0x00df
            r3 = r13
            r15 = r17
            r14 = r18
            r5 = r19
            r8 = r21
            r13 = r22
            r2 = r23
            goto L_0x0069
        L_0x00df:
            java.lang.Object r5 = r12.c(r14)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r5 != 0) goto L_0x00f2
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            xs r5 = defpackage.ay7.d(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            goto L_0x00f5
        L_0x00f0:
            r0 = move-exception
            goto L_0x00a4
        L_0x00f2:
            r5.add(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x00f5:
            r12.f(r14, r5)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            int r3 = r6.getInt(r9)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.d = r3     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            long r2 = r6.getLong(r7)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.e = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.lang.String r2 = r6.getString(r10)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.lang.String r3 = r8.a     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r3 != 0) goto L_0x010e
            r8.a = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x010e:
            java.lang.String r2 = r6.getString(r1)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            boolean r3 = defpackage.oag.t(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r3 != 0) goto L_0x0124
            boolean r3 = r2.endsWith(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r3 == 0) goto L_0x0124
            java.lang.String r3 = ""
            java.lang.String r2 = r2.replace(r0, r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x0124:
            r8.c = r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x0126:
            r20 = r17
            r5 = r18
            r17 = r0
            r18 = r1
        L_0x012e:
            r1 = r22
            goto L_0x018c
        L_0x0131:
            boolean r2 = r13.equals(r5)     // Catch:{ Exception -> 0x01a7, all -> 0x00ad }
            if (r2 == 0) goto L_0x0126
            r2 = r17
            java.lang.String r3 = r6.getString(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r17 = r0
            r5 = r18
            java.lang.String r0 = r6.getString(r5)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r18 = r1
            r20 = r2
            r1 = r23
            java.lang.String r2 = r6.getString(r1)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            boolean r23 = defpackage.oag.t(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r23 == 0) goto L_0x0160
            boolean r2 = defpackage.oag.u(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r2 == 0) goto L_0x015d
            r8.a = r0     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x015d:
            r23 = r1
            goto L_0x012e
        L_0x0160:
            boolean r23 = defpackage.oag.u(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r23 == 0) goto L_0x017f
            r23 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r1.<init>()     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r1.append(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.lang.String r3 = " "
            r1.append(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r1.append(r2)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            r8.a = r1     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            goto L_0x0183
        L_0x017f:
            r23 = r1
            r8.a = r3     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
        L_0x0183:
            boolean r1 = defpackage.oag.u(r0)     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            if (r1 == 0) goto L_0x012e
            r8.b = r0     // Catch:{ Exception -> 0x00f0, all -> 0x00ad }
            goto L_0x012e
        L_0x018c:
            r1.f(r14, r8)     // Catch:{ Exception -> 0x01a0, all -> 0x00ad }
            r14 = r5
            r3 = r13
            r0 = r17
            r5 = r19
            r15 = r20
            r8 = r21
            r2 = r23
            r13 = r1
            r1 = r18
            goto L_0x0069
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            r14 = r6
            r2 = r16
        L_0x01a4:
            r3 = r19
            goto L_0x01d3
        L_0x01a7:
            r0 = move-exception
            r1 = r22
            goto L_0x01a1
        L_0x01ab:
            r0 = move-exception
        L_0x01ac:
            r1 = r13
            goto L_0x01a1
        L_0x01ae:
            r0 = move-exception
            r19 = r5
            goto L_0x01ac
        L_0x01b2:
            r19 = r5
            r1 = r13
            goto L_0x01be
        L_0x01b6:
            r0 = move-exception
            r16 = r2
            r19 = r5
            r1 = r13
            r14 = r6
            goto L_0x01a4
        L_0x01be:
            if (r6 == 0) goto L_0x01c3
            r6.close()
        L_0x01c3:
            r3 = r19
            goto L_0x01e8
        L_0x01c6:
            r0 = move-exception
            r14 = 0
            goto L_0x0282
        L_0x01ca:
            r0 = move-exception
            r16 = r2
            r19 = r5
            r1 = r13
            r3 = r19
            r14 = 0
        L_0x01d3:
            defpackage.hm9.p(r3, r2, r0)     // Catch:{ all -> 0x0281 }
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x0281 }
            r0.<init>(r2)     // Catch:{ all -> 0x0281 }
            r2 = r25
            cba r2 = (defpackage.cba) r2     // Catch:{ all -> 0x0281 }
            r4 = 1
            r2.c(r0, r4)     // Catch:{ all -> 0x0281 }
            if (r14 == 0) goto L_0x01e8
            r14.close()
        L_0x01e8:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13 = 0
        L_0x01ee:
            int r2 = r12.h()
            if (r13 >= r2) goto L_0x027c
            long r4 = r12.e(r13)
            java.lang.Object r2 = r12.i(r13)
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r1.c(r4)
            cva r4 = (defpackage.cva) r4
            if (r4 != 0) goto L_0x0211
            java.lang.String r2 = "contact is null"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            defpackage.hm9.m0(r3, r2, r5)
        L_0x020e:
            r2 = 1
            r4 = 0
            goto L_0x0279
        L_0x0211:
            if (r2 == 0) goto L_0x0270
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x021a
            goto L_0x0270
        L_0x021a:
            java.util.Iterator r2 = r2.iterator()
        L_0x021e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x020e
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            vua r6 = new vua
            r6.<init>()
            int r7 = r4.d
            r6.b = r7
            r6.c = r5
            java.lang.String r7 = r4.a
            boolean r7 = defpackage.oag.t(r7)
            if (r7 == 0) goto L_0x023f
            r7 = r5
            goto L_0x0241
        L_0x023f:
            java.lang.String r7 = r4.a
        L_0x0241:
            r6.e = r7
            java.lang.String r7 = r4.b
            r6.f = r7
            long r7 = r4.e
            r6.a = r7
            r7 = 0
            r6.h = r7
            java.lang.String r7 = r4.c
            r6.g = r7
            java.lang.Object r7 = r0.get(r5)
            vua r7 = (defpackage.vua) r7
            if (r7 != 0) goto L_0x025e
            r0.put(r5, r6)
            goto L_0x021e
        L_0x025e:
            java.lang.String r7 = r7.a()
            java.lang.String r8 = r6.a()
            int r7 = r8.compareTo(r7)
            if (r7 >= 0) goto L_0x021e
            r0.put(r5, r6)
            goto L_0x021e
        L_0x0270:
            java.lang.String r2 = "phones is null or empty"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            defpackage.hm9.m0(r3, r2, r5)
            r2 = 1
        L_0x0279:
            int r13 = r13 + r2
            goto L_0x01ee
        L_0x027c:
            java.util.Collection r0 = r0.values()
            return r0
        L_0x0281:
            r0 = move-exception
        L_0x0282:
            if (r14 == 0) goto L_0x0287
            r14.close()
        L_0x0287:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.p(android.content.Context, o45):java.util.Collection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0051 A[SYNTHETIC, Splitter:B:37:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x005e A[SYNTHETIC, Splitter:B:45:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String q(android.content.ContentResolver r5, android.net.Uri r6, defpackage.o45 r7) {
        /*
            java.lang.String r0 = "mqd"
            r1 = 0
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r6, r2)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r5 != 0) goto L_0x001c
            java.lang.String r6 = "getVCardStringFromUri: failed to get file descriptor"
            defpackage.hm9.p(r0, r6, r1)     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            if (r5 == 0) goto L_0x0015
            r5.close()     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            return r1
        L_0x0016:
            r2 = r1
            goto L_0x003a
        L_0x0018:
            r6 = move-exception
            goto L_0x0059
        L_0x001a:
            r6 = move-exception
            goto L_0x0016
        L_0x001c:
            java.io.FileInputStream r6 = r5.createInputStream()     // Catch:{ Exception -> 0x001a, all -> 0x0018 }
            java.lang.String r7 = defpackage.s5c.J(r6)     // Catch:{ Exception -> 0x002f, all -> 0x002b }
            defpackage.s5c.n(r6)
            r5.close()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            return r7
        L_0x002b:
            r7 = move-exception
            r1 = r6
            r6 = r7
            goto L_0x0059
        L_0x002f:
            r2 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L_0x003a
        L_0x0034:
            r6 = move-exception
            r5 = r1
            goto L_0x0059
        L_0x0037:
            r6 = move-exception
            r5 = r1
            r2 = r5
        L_0x003a:
            java.lang.String r3 = "getVCardStringFromUri: failed to get vCardString from Uri"
            defpackage.hm9.p(r0, r3, r6)     // Catch:{ all -> 0x0057 }
            ru.ok.tamtam.util.HandledException r6 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "getVCardStringFromUri failed"
            r6.<init>(r0)     // Catch:{ all -> 0x0057 }
            cba r7 = (defpackage.cba) r7     // Catch:{ all -> 0x0057 }
            r0 = 1
            r7.c(r6, r0)     // Catch:{ all -> 0x0057 }
            defpackage.s5c.n(r2)
            if (r5 == 0) goto L_0x0054
            r5.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            return r1
        L_0x0055:
            r1 = r2
            goto L_0x0059
        L_0x0057:
            r6 = move-exception
            goto L_0x0055
        L_0x0059:
            defpackage.s5c.n(r1)
            if (r5 == 0) goto L_0x0061
            r5.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.q(android.content.ContentResolver, android.net.Uri, o45):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r10.isClosed() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        if (r10.isClosed() == false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.SparseArray r(android.content.Context r11, java.util.List r12, defpackage.o45 r13) {
        /*
            java.lang.String r0 = "getVCardsByPhoneContactIds failed"
            java.lang.String r1 = "_id IN ("
            android.util.SparseArray r2 = new android.util.SparseArray
            int r3 = r12.size()
            r2.<init>(r3)
            android.content.ContentResolver r11 = r11.getContentResolver()
            java.lang.String r3 = "mqd"
            if (r11 != 0) goto L_0x001b
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: contentResolver is null"
            defpackage.hm9.o(r3, r11)
            return r2
        L_0x001b:
            r10 = 0
            java.lang.String r4 = ","
            java.lang.String r12 = android.text.TextUtils.join(r4, r12)     // Catch:{ Exception -> 0x0053 }
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x0053 }
            java.lang.String[] r6 = c     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0053 }
            r4.append(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r12 = ")"
            r4.append(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r8 = 0
            r9 = 0
            r4 = r11
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0053 }
            if (r10 != 0) goto L_0x0055
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: cursor is null"
            defpackage.hm9.o(r3, r11)     // Catch:{ Exception -> 0x0053 }
            if (r10 == 0) goto L_0x0050
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x0050
            r10.close()
        L_0x0050:
            return r2
        L_0x0051:
            r11 = move-exception
            goto L_0x00ba
        L_0x0053:
            r11 = move-exception
            goto L_0x00a2
        L_0x0055:
            java.lang.String r12 = "_id"
            int r12 = r10.getColumnIndex(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = "lookup"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x0053 }
        L_0x0061:
            boolean r4 = r10.moveToNext()     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x0098
            int r4 = r10.getInt(r12)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = r10.getString(r1)     // Catch:{ Exception -> 0x0053 }
            boolean r6 = defpackage.oag.t(r5)     // Catch:{ Exception -> 0x0053 }
            if (r6 == 0) goto L_0x0084
            java.lang.String r11 = "getVCardsByPhoneContactIds failed: lookupKey is empty or null"
            defpackage.hm9.o(r3, r11)     // Catch:{ Exception -> 0x0053 }
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x0083
            r10.close()
        L_0x0083:
            return r2
        L_0x0084:
            android.net.Uri r6 = android.provider.ContactsContract.Contacts.CONTENT_VCARD_URI     // Catch:{ Exception -> 0x0053 }
            android.net.Uri r5 = android.net.Uri.withAppendedPath(r6, r5)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = q(r11, r5, r13)     // Catch:{ Exception -> 0x0053 }
            boolean r6 = defpackage.oag.t(r5)     // Catch:{ Exception -> 0x0053 }
            if (r6 != 0) goto L_0x0061
            r2.put(r4, r5)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0061
        L_0x0098:
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x00b9
        L_0x009e:
            r10.close()
            goto L_0x00b9
        L_0x00a2:
            defpackage.hm9.p(r3, r0, r11)     // Catch:{ all -> 0x0051 }
            ru.ok.tamtam.util.HandledException r11 = new ru.ok.tamtam.util.HandledException     // Catch:{ all -> 0x0051 }
            r11.<init>(r0)     // Catch:{ all -> 0x0051 }
            cba r13 = (defpackage.cba) r13     // Catch:{ all -> 0x0051 }
            r12 = 1
            r13.c(r11, r12)     // Catch:{ all -> 0x0051 }
            if (r10 == 0) goto L_0x00b9
            boolean r11 = r10.isClosed()
            if (r11 != 0) goto L_0x00b9
            goto L_0x009e
        L_0x00b9:
            return r2
        L_0x00ba:
            if (r10 == 0) goto L_0x00c5
            boolean r12 = r10.isClosed()
            if (r12 != 0) goto L_0x00c5
            r10.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.r(android.content.Context, java.util.List, o45):android.util.SparseArray");
    }

    public static boolean s(Context context) {
        Class<mqd> cls = mqd.class;
        try {
            boolean z = true;
            if (context.getPackageManager().getComponentEnabledSetting(new ComponentName("ru.oneme.app", SingleCoreActivity.class.getName())) != 1) {
                z = false;
            }
            a = z;
            String name = cls.getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null) {
                if (ir6.c()) {
                    ir6.d(us7.X, name, "isEnabled=" + a, (Throwable) null);
                }
            }
            return a;
        } catch (Throwable th) {
            hm9.p(cls.getName(), "fail to get component", th);
            return false;
        }
    }

    public static boolean t(View view) {
        WeakHashMap weakHashMap = zmf.a;
        return view.getLayoutDirection() == 1;
    }

    public static boolean u(int i, String str) {
        return e <= i || Log.isLoggable(str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r9 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r7 = new defpackage.bx8(r7, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cx8 v(defpackage.gy8 r13) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            int r3 = defpackage.lz7.N(r13)
            r4 = 0
            r5 = 0
            r7 = r4
            r6 = r5
            r8 = r6
        L_0x000f:
            if (r6 >= r3) goto L_0x010c
            r9 = 1
            java.lang.String r10 = defpackage.lz7.P(r13)     // Catch:{ all -> 0x0017 }
            goto L_0x0046
        L_0x0017:
            r10 = move-exception
            defpackage.hm9.l0(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.u7d.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0021:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0034
            java.lang.Object r12 = r11.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r10)
            goto L_0x0021
        L_0x0034:
            int r11 = defpackage.k7d.a
            int r11 = defpackage.au1.s(r11)
            if (r11 == 0) goto L_0x0045
            if (r11 == r9) goto L_0x0044
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0044:
            throw r10
        L_0x0045:
            r10 = r4
        L_0x0046:
            java.lang.String r11 = "reaction"
            boolean r11 = defpackage.tpa.f(r10, r11)
            if (r11 == 0) goto L_0x008e
            gx8 r7 = defpackage.gx8.EMOJI
            java.lang.String r9 = defpackage.lz7.P(r13)     // Catch:{ all -> 0x0057 }
            if (r9 != 0) goto L_0x0086
            goto L_0x0085
        L_0x0057:
            r10 = move-exception
            defpackage.hm9.l0(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.u7d.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0061:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0074
            java.lang.Object r12 = r11.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r10)
            goto L_0x0061
        L_0x0074:
            int r11 = defpackage.k7d.a
            int r11 = defpackage.au1.s(r11)
            if (r11 == 0) goto L_0x0085
            if (r11 == r9) goto L_0x0084
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0084:
            throw r10
        L_0x0085:
            r9 = r0
        L_0x0086:
            bx8 r10 = new bx8
            r10.<init>(r7, r9)
            r7 = r10
            goto L_0x0108
        L_0x008e:
            java.lang.String r11 = "count"
            boolean r10 = defpackage.tpa.f(r10, r11)
            if (r10 == 0) goto L_0x00d6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            int r10 = defpackage.lz7.L(r13)     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00a3 }
            goto L_0x00d1
        L_0x00a3:
            r10 = move-exception
            defpackage.hm9.l0(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.u7d.a
            java.util.Iterator r11 = r11.iterator()
        L_0x00ad:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00c0
            java.lang.Object r12 = r11.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r10)
            goto L_0x00ad
        L_0x00c0:
            int r11 = defpackage.k7d.a
            int r11 = defpackage.au1.s(r11)
            if (r11 == 0) goto L_0x00d1
            if (r11 == r9) goto L_0x00d0
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x00d0:
            throw r10
        L_0x00d1:
            int r8 = r8.intValue()
            goto L_0x0108
        L_0x00d6:
            r13.z()     // Catch:{ all -> 0x00da }
            goto L_0x0108
        L_0x00da:
            r10 = move-exception
            defpackage.hm9.l0(r2, r1, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.u7d.a
            java.util.Iterator r11 = r11.iterator()
        L_0x00e4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00f7
            java.lang.Object r12 = r11.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r10)
            goto L_0x00e4
        L_0x00f7:
            int r11 = defpackage.k7d.a
            int r11 = defpackage.au1.s(r11)
            if (r11 == 0) goto L_0x0108
            if (r11 == r9) goto L_0x0107
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0107:
            throw r10
        L_0x0108:
            int r6 = r6 + 1
            goto L_0x000f
        L_0x010c:
            cx8 r13 = new cx8
            if (r7 == 0) goto L_0x0114
            r13.<init>(r7, r8)
            return r13
        L_0x0114:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "reaction is null"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.v(gy8):cx8");
    }

    public static JSONObject w(db7 db7) {
        try {
            JSONObject jSONObject = new JSONObject();
            db7.s();
            while (db7.peek() != 125) {
                jSONObject.put(db7.T(), x(db7, JSONObject.NULL));
            }
            db7.q();
            return jSONObject;
        } catch (JSONException e2) {
            throw new AssertionError(e2);
        }
    }

    public static Object x(db7 db7, Object obj) {
        try {
            int peek = db7.peek();
            if (peek == 34) {
                return db7.H();
            }
            if (peek == 49) {
                String V = db7.V();
                if (V.indexOf(46) >= 0 || V.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || V.indexOf(69) >= 0) {
                    return Double.valueOf(Double.parseDouble(V));
                }
                long parseLong = Long.parseLong(V);
                return (parseLong < -2147483648L || parseLong > 2147483647L) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
            } else if (peek == 91) {
                JSONArray jSONArray = new JSONArray();
                db7.u();
                while (db7.peek() != 93) {
                    jSONArray.put(x(db7, (Object) null));
                }
                db7.t();
                return jSONArray;
            } else if (peek == 98) {
                return Boolean.valueOf(db7.a0());
            } else {
                if (peek == 110) {
                    db7.z();
                    return obj;
                } else if (peek == 123) {
                    return w(db7);
                } else {
                    throw JsonStateException.d(peek);
                }
            }
        } catch (JsonTypeMismatchException e2) {
            throw new AssertionError(e2);
        }
    }

    public static tpb y(byte[] bArr) {
        wpa wpa = new wpa(bArr);
        if (wpa.c < 32) {
            return null;
        }
        wpa.G(0);
        int a2 = wpa.a();
        int g = wpa.g();
        if (g != a2) {
            z04.c0("Advertised atom size (" + g + ") does not match buffer size: " + a2);
            return null;
        }
        int g2 = wpa.g();
        if (g2 != 1886614376) {
            ey8.k(g2, "Atom type is not pssh: ");
            return null;
        }
        int t = oy.t(wpa.g());
        if (t > 1) {
            ey8.k(t, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(wpa.o(), wpa.o());
        if (t == 1) {
            int y = wpa.y();
            UUID[] uuidArr = new UUID[y];
            for (int i = 0; i < y; i++) {
                uuidArr[i] = new UUID(wpa.o(), wpa.o());
            }
        }
        int y2 = wpa.y();
        int a3 = wpa.a();
        if (y2 != a3) {
            z04.c0("Atom data size (" + y2 + ") does not match the bytes left: " + a3);
            return null;
        }
        byte[] bArr2 = new byte[y2];
        wpa.e(0, bArr2, y2);
        return new tpb(uuid, t, bArr2);
    }

    public static byte[] z(UUID uuid, byte[] bArr) {
        tpb y = y(bArr);
        if (y == null) {
            return null;
        }
        UUID uuid2 = y.a;
        if (uuid.equals(uuid2)) {
            return y.c;
        }
        z04.c0("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public abstract void B(l3 l3Var, l3 l3Var2);

    public abstract void C(l3 l3Var, Thread thread);

    public abstract boolean c(m3 m3Var, i3 i3Var, i3 i3Var2);

    public abstract boolean d(m3 m3Var, Object obj, Object obj2);

    public abstract boolean e(m3 m3Var, l3 l3Var, l3 l3Var2);
}
