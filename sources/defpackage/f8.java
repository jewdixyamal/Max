package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* renamed from: f8  reason: default package */
public final class f8 {
    public static final o97 b = new o97("CRASH_FREE", 1);
    public static final ob6 c = new Object();
    public static boolean d;
    public final /* synthetic */ int a;

    public /* synthetic */ f8(int i) {
        this.a = i;
    }

    public static void A(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(rh4.j(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        tpa.G(classCastException, f8.class.getName());
        throw classCastException;
    }

    public static Bitmap B(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static final ih1 C(y4c y4c, boolean z) {
        int ordinal = y4c.ordinal();
        switch (y4c.ordinal()) {
            case 0:
                return new ih1(ordinal, new eqe(b8a.t0));
            case 1:
                return new ih1(ordinal, new eqe(b8a.r0));
            case 2:
                return new ih1(ordinal, new eqe(b8a.C0));
            case 3:
                return new ih1(ordinal, new eqe(b8a.u0));
            case 4:
                return new ih1(ordinal, new eqe(b8a.s0));
            case 5:
                return new ih1(ordinal, new eqe(b8a.z0));
            case 6:
                return new ih1(ordinal, new eqe(b8a.A0));
            case 7:
                return new ih1(ordinal, new eqe(b8a.B0));
            case 8:
                return new ih1(ordinal, new eqe(b8a.y0));
            case 9:
                return new ih1(ordinal, new eqe(b8a.x0));
            case 10:
                return new ih1(ordinal, z ? new eqe(b8a.w0) : new eqe(b8a.v0));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void D(RippleDrawable rippleDrawable, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = rippleDrawable.getBounds().left;
        }
        if ((i4 & 2) != 0) {
            i2 = rippleDrawable.getBounds().top;
        }
        int i5 = rippleDrawable.getBounds().right;
        if ((i4 & 8) != 0) {
            i3 = rippleDrawable.getBounds().bottom;
        }
        rippleDrawable.setBounds(i, i2, i5, i3);
    }

    public static boolean E(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static boolean F(int i, yaf yaf, boolean z) {
        if (yaf.c() < 7) {
            if (z) {
                return false;
            }
            int c2 = yaf.c();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(c2);
            throw ParserException.a((RuntimeException) null, sb.toString());
        } else if (yaf.v() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw ParserException.a((RuntimeException) null, valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (yaf.v() == 118 && yaf.v() == 111 && yaf.v() == 114 && yaf.v() == 98 && yaf.v() == 105 && yaf.v() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "expected characters 'vorbis'");
        }
    }

    public static final int G(int i, float f) {
        return Color.argb(tu0.G(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void H(Parcel parcel, String str) {
        byte b2 = str != null ? (byte) 1 : 0;
        parcel.writeByte(b2);
        if (b2 != 0) {
            parcel.writeString(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0244, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0251, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:186:0x0230, B:202:0x024d] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ba A[SYNTHETIC, Splitter:B:139:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x028f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1 A[SYNTHETIC, Splitter:B:55:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void I(android.content.Context r17, java.util.concurrent.Executor r18, defpackage.ihb r19, boolean r20) {
        /*
            r1 = r17
            r8 = r19
            android.content.Context r0 = r17.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r17.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x0298 }
            java.io.File r13 = r17.getFilesDir()
            r14 = 0
            r15 = 1
            if (r20 != 0) goto L_0x0079
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x003f
            r0 = r11
            goto L_0x006d
        L_0x003f:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006c }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006c }
            r4.<init>(r0)     // Catch:{ IOException -> 0x006c }
            r3.<init>(r4)     // Catch:{ IOException -> 0x006c }
            long r4 = r3.readLong()     // Catch:{ all -> 0x0060 }
            r3.close()     // Catch:{ IOException -> 0x006c }
            long r10 = r12.lastUpdateTime
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            r0 = r15
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x006d
            r3 = 2
            r8.f(r3, r14)
            goto L_0x006d
        L_0x0060:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006b
        L_0x0066:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ IOException -> 0x006c }
        L_0x006b:
            throw r4     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != 0) goto L_0x0070
            goto L_0x0079
        L_0x0070:
            r17.getPackageName()
            r2 = 0
            defpackage.fmb.c(r1, r2)
            goto L_0x0297
        L_0x0079:
            r17.getPackageName()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r10 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r10.<init>(r3, r2)
            xu3 r11 = new xu3
            java.lang.String r7 = "dexopt/baseline.prof"
            r2 = r11
            r3 = r9
            r4 = r18
            r5 = r19
            r16 = r7
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r2 = r11.d
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x00ad
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r11.t(r2, r0)
        L_0x00aa:
            r4 = r15
            goto L_0x028c
        L_0x00ad:
            boolean r0 = r10.exists()
            r3 = 4
            if (r0 == 0) goto L_0x00be
            boolean r0 = r10.canWrite()
            if (r0 != 0) goto L_0x00c1
            r11.t(r3, r14)
            goto L_0x00aa
        L_0x00be:
            r10.createNewFile()     // Catch:{ IOException -> 0x0288 }
        L_0x00c1:
            r11.a = r15
            byte[] r4 = defpackage.m6d.b
            r5 = 6
            r0 = r16
            java.io.FileInputStream r0 = r11.r(r9, r0)     // Catch:{ FileNotFoundException -> 0x00d5, IOException -> 0x00ce }
            r6 = r0
            goto L_0x00db
        L_0x00ce:
            r0 = move-exception
            r6 = r0
            r7 = 7
            r8.f(r7, r6)
            goto L_0x00da
        L_0x00d5:
            r0 = move-exception
            r6 = r0
            r8.f(r5, r6)
        L_0x00da:
            r6 = r14
        L_0x00db:
            java.lang.String r7 = "Invalid magic"
            r10 = 8
            if (r6 == 0) goto L_0x013b
            byte[] r0 = defpackage.i24.x(r6, r3)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            if (r0 == 0) goto L_0x0109
            byte[] r0 = defpackage.i24.x(r6, r3)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            java.lang.Object r5 = r11.f     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            bj4[] r5 = defpackage.m6d.G(r6, r0, r5)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            r6.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x012d
        L_0x00fb:
            r0 = move-exception
            r6 = r0
            r15 = 7
            r8.f(r15, r6)
            goto L_0x012d
        L_0x0102:
            r0 = move-exception
        L_0x0103:
            r1 = r0
            goto L_0x0130
        L_0x0105:
            r0 = move-exception
            goto L_0x010f
        L_0x0107:
            r15 = 7
            goto L_0x0122
        L_0x0109:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
            throw r0     // Catch:{ IOException -> 0x0120, IllegalStateException -> 0x0105 }
        L_0x010f:
            r8.f(r10, r0)     // Catch:{ all -> 0x011d }
            r6.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x012c
        L_0x0116:
            r0 = move-exception
            r5 = r0
            r15 = 7
        L_0x0119:
            r8.f(r15, r5)
            goto L_0x012c
        L_0x011d:
            r0 = move-exception
            r15 = 7
            goto L_0x0103
        L_0x0120:
            r0 = move-exception
            goto L_0x0107
        L_0x0122:
            r8.f(r15, r0)     // Catch:{ all -> 0x0102 }
            r6.close()     // Catch:{ IOException -> 0x0129 }
            goto L_0x012c
        L_0x0129:
            r0 = move-exception
            r5 = r0
            goto L_0x0119
        L_0x012c:
            r5 = r14
        L_0x012d:
            r11.g = r5
            goto L_0x013b
        L_0x0130:
            r6.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x013a
        L_0x0134:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.f(r3, r2)
        L_0x013a:
            throw r1
        L_0x013b:
            java.lang.Object r0 = r11.g
            bj4[] r0 = (defpackage.bj4[]) r0
            if (r0 == 0) goto L_0x01a2
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r5 <= r6) goto L_0x0148
            goto L_0x01a2
        L_0x0148:
            switch(r5) {
                case 31: goto L_0x014c;
                case 32: goto L_0x014c;
                case 33: goto L_0x014c;
                case 34: goto L_0x014c;
                default: goto L_0x014b;
            }
        L_0x014b:
            goto L_0x01a2
        L_0x014c:
            java.lang.String r5 = "dexopt/baseline.profm"
            java.io.FileInputStream r5 = r11.r(r9, r5)     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            if (r5 == 0) goto L_0x0189
            byte[] r6 = defpackage.m6d.c     // Catch:{ all -> 0x0176 }
            byte[] r9 = defpackage.i24.x(r5, r3)     // Catch:{ all -> 0x0176 }
            boolean r6 = java.util.Arrays.equals(r6, r9)     // Catch:{ all -> 0x0176 }
            if (r6 == 0) goto L_0x0179
            byte[] r3 = defpackage.i24.x(r5, r3)     // Catch:{ all -> 0x0176 }
            bj4[] r0 = defpackage.m6d.D(r5, r3, r2, r0)     // Catch:{ all -> 0x0176 }
            r11.g = r0     // Catch:{ all -> 0x0176 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            r0 = r11
            goto L_0x019f
        L_0x016f:
            r0 = move-exception
            goto L_0x018f
        L_0x0171:
            r0 = move-exception
            r2 = 7
            goto L_0x0195
        L_0x0174:
            r0 = move-exception
            goto L_0x0199
        L_0x0176:
            r0 = move-exception
            r2 = r0
            goto L_0x017f
        L_0x0179:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0176 }
            r0.<init>(r7)     // Catch:{ all -> 0x0176 }
            throw r0     // Catch:{ all -> 0x0176 }
        L_0x017f:
            r5.close()     // Catch:{ all -> 0x0183 }
            goto L_0x0188
        L_0x0183:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
        L_0x0188:
            throw r2     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
        L_0x0189:
            if (r5 == 0) goto L_0x019e
            r5.close()     // Catch:{ FileNotFoundException -> 0x0174, IOException -> 0x0171, IllegalStateException -> 0x016f }
            goto L_0x019e
        L_0x018f:
            r11.g = r14
            r8.f(r10, r0)
            goto L_0x019e
        L_0x0195:
            r8.f(r2, r0)
            goto L_0x019e
        L_0x0199:
            r2 = 9
            r8.f(r2, r0)
        L_0x019e:
            r0 = r14
        L_0x019f:
            if (r0 == 0) goto L_0x01a2
            r11 = r0
        L_0x01a2:
            java.lang.Object r0 = r11.c
            r2 = r0
            ihb r2 = (defpackage.ihb) r2
            java.lang.Object r0 = r11.g
            bj4[] r0 = (defpackage.bj4[]) r0
            java.lang.String r3 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0201
            java.lang.Object r5 = r11.d
            byte[] r5 = (byte[]) r5
            if (r5 != 0) goto L_0x01b6
            goto L_0x0201
        L_0x01b6:
            boolean r6 = r11.a
            if (r6 == 0) goto L_0x01fb
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            r6.<init>()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            r6.write(r4)     // Catch:{ all -> 0x01da }
            r6.write(r5)     // Catch:{ all -> 0x01da }
            boolean r0 = defpackage.m6d.R(r6, r5, r0)     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x01dd
            r0 = 5
            r2.f(r0, r14)     // Catch:{ all -> 0x01da }
            r11.g = r14     // Catch:{ all -> 0x01da }
            r6.close()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            goto L_0x0201
        L_0x01d5:
            r0 = move-exception
            goto L_0x01f1
        L_0x01d7:
            r0 = move-exception
            r4 = 7
            goto L_0x01f5
        L_0x01da:
            r0 = move-exception
            r4 = r0
            goto L_0x01e7
        L_0x01dd:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x01da }
            r11.h = r0     // Catch:{ all -> 0x01da }
            r6.close()     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
            goto L_0x01f8
        L_0x01e7:
            r6.close()     // Catch:{ all -> 0x01eb }
            goto L_0x01f0
        L_0x01eb:
            r0 = move-exception
            r5 = r0
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
        L_0x01f0:
            throw r4     // Catch:{ IOException -> 0x01d7, IllegalStateException -> 0x01d5 }
        L_0x01f1:
            r2.f(r10, r0)
            goto L_0x01f8
        L_0x01f5:
            r2.f(r4, r0)
        L_0x01f8:
            r11.g = r14
            goto L_0x0201
        L_0x01fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0201:
            java.lang.Object r0 = r11.h
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L_0x020b
            r2 = 0
            r4 = 1
            goto L_0x0277
        L_0x020b:
            boolean r2 = r11.a
            if (r2 == 0) goto L_0x0282
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0267, IOException -> 0x0264 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0267, IOException -> 0x0264 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0257 }
            java.lang.Object r0 = r11.e     // Catch:{ all -> 0x0257 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0257 }
            r3.<init>(r0)     // Catch:{ all -> 0x0257 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x024a }
        L_0x0221:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x024a }
            if (r4 <= 0) goto L_0x022c
            r5 = 0
            r3.write(r0, r5, r4)     // Catch:{ all -> 0x024a }
            goto L_0x0221
        L_0x022c:
            r4 = 1
            r11.t(r4, r14)     // Catch:{ all -> 0x0247 }
            r3.close()     // Catch:{ all -> 0x0244 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
            r11.h = r14
            r11.g = r14
            r2 = r4
            goto L_0x0277
        L_0x023c:
            r0 = move-exception
            goto L_0x027d
        L_0x023e:
            r0 = move-exception
        L_0x023f:
            r2 = 7
            goto L_0x026a
        L_0x0241:
            r0 = move-exception
        L_0x0242:
            r2 = 6
            goto L_0x0272
        L_0x0244:
            r0 = move-exception
        L_0x0245:
            r3 = r0
            goto L_0x025a
        L_0x0247:
            r0 = move-exception
        L_0x0248:
            r5 = r0
            goto L_0x024d
        L_0x024a:
            r0 = move-exception
            r4 = 1
            goto L_0x0248
        L_0x024d:
            r3.close()     // Catch:{ all -> 0x0251 }
            goto L_0x0256
        L_0x0251:
            r0 = move-exception
            r3 = r0
            r5.addSuppressed(r3)     // Catch:{ all -> 0x0244 }
        L_0x0256:
            throw r5     // Catch:{ all -> 0x0244 }
        L_0x0257:
            r0 = move-exception
            r4 = 1
            goto L_0x0245
        L_0x025a:
            r2.close()     // Catch:{ all -> 0x025e }
            goto L_0x0263
        L_0x025e:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
        L_0x0263:
            throw r3     // Catch:{ FileNotFoundException -> 0x0241, IOException -> 0x023e }
        L_0x0264:
            r0 = move-exception
            r4 = 1
            goto L_0x023f
        L_0x0267:
            r0 = move-exception
            r4 = 1
            goto L_0x0242
        L_0x026a:
            r11.t(r2, r0)     // Catch:{ all -> 0x023c }
        L_0x026d:
            r11.h = r14
            r11.g = r14
            goto L_0x0276
        L_0x0272:
            r11.t(r2, r0)     // Catch:{ all -> 0x023c }
            goto L_0x026d
        L_0x0276:
            r2 = 0
        L_0x0277:
            if (r2 == 0) goto L_0x028d
            s(r12, r13)
            goto L_0x028d
        L_0x027d:
            r11.h = r14
            r11.g = r14
            throw r0
        L_0x0282:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0288:
            r4 = r15
            r11.t(r3, r14)
        L_0x028c:
            r2 = 0
        L_0x028d:
            if (r2 == 0) goto L_0x0293
            if (r20 == 0) goto L_0x0293
            r11 = r4
            goto L_0x0294
        L_0x0293:
            r11 = 0
        L_0x0294:
            defpackage.fmb.c(r1, r11)
        L_0x0297:
            return
        L_0x0298:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.f(r3, r2)
            r2 = 0
            defpackage.fmb.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8.I(android.content.Context, java.util.concurrent.Executor, ihb, boolean):void");
    }

    public static List a(List list) {
        if (!(list instanceof qb7) || (list instanceof sb7)) {
            return list;
        }
        A(list, "kotlin.collections.MutableList");
        throw null;
    }

    public static Map b(Map map) {
        if (!(map instanceof qb7) || (map instanceof ub7)) {
            return map;
        }
        A(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void c(int i, Object obj) {
        if (obj != null && !n(i, obj)) {
            A(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [o5g, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.o5g e(defpackage.hj3 r7, int r8, java.util.ArrayList r9, defpackage.o5g r10) {
        /*
            if (r8 != 0) goto L_0x0005
            int r0 = r7.n0
            goto L_0x0007
        L_0x0005:
            int r0 = r7.o0
        L_0x0007:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L_0x002f
            if (r10 == 0) goto L_0x0011
            int r3 = r10.b
            if (r0 == r3) goto L_0x002f
        L_0x0011:
            r3 = r1
        L_0x0012:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x0032
            java.lang.Object r4 = r9.get(r3)
            o5g r4 = (defpackage.o5g) r4
            int r5 = r4.b
            if (r5 != r0) goto L_0x002c
            if (r10 == 0) goto L_0x002a
            r10.c(r8, r4)
            r9.remove(r10)
        L_0x002a:
            r10 = r4
            goto L_0x0032
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002f:
            if (r0 == r2) goto L_0x0032
            return r10
        L_0x0032:
            r0 = 1
            if (r10 != 0) goto L_0x008f
            boolean r3 = r7 instanceof defpackage.uj6
            if (r3 == 0) goto L_0x006f
            r3 = r7
            uj6 r3 = (defpackage.uj6) r3
            r4 = r1
        L_0x003d:
            int r5 = r3.r0
            if (r4 >= r5) goto L_0x0056
            hj3[] r5 = r3.q0
            r5 = r5[r4]
            if (r8 != 0) goto L_0x004c
            int r6 = r5.n0
            if (r6 == r2) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            if (r8 != r0) goto L_0x0053
            int r6 = r5.o0
            if (r6 == r2) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0056:
            r6 = r2
        L_0x0057:
            if (r6 == r2) goto L_0x006f
            r3 = r1
        L_0x005a:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x006f
            java.lang.Object r4 = r9.get(r3)
            o5g r4 = (defpackage.o5g) r4
            int r5 = r4.b
            if (r5 != r6) goto L_0x006c
            r10 = r4
            goto L_0x006f
        L_0x006c:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006f:
            if (r10 != 0) goto L_0x008c
            o5g r10 = new o5g
            r10.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.a = r3
            r3 = 0
            r10.d = r3
            r10.e = r2
            int r2 = defpackage.o5g.f
            int r3 = r2 + 1
            defpackage.o5g.f = r3
            r10.b = r2
            r10.c = r8
        L_0x008c:
            r9.add(r10)
        L_0x008f:
            java.util.ArrayList r2 = r10.a
            boolean r3 = r2.contains(r7)
            if (r3 == 0) goto L_0x0098
            goto L_0x00d3
        L_0x0098:
            r2.add(r7)
            boolean r2 = r7 instanceof defpackage.fh6
            if (r2 == 0) goto L_0x00ac
            r2 = r7
            fh6 r2 = (defpackage.fh6) r2
            oi3 r3 = r2.t0
            int r2 = r2.u0
            if (r2 != 0) goto L_0x00a9
            r1 = r0
        L_0x00a9:
            r3.c(r1, r10, r9)
        L_0x00ac:
            int r0 = r10.b
            if (r8 != 0) goto L_0x00bd
            r7.n0 = r0
            oi3 r0 = r7.I
            r0.c(r8, r10, r9)
            oi3 r0 = r7.K
            r0.c(r8, r10, r9)
            goto L_0x00ce
        L_0x00bd:
            r7.o0 = r0
            oi3 r0 = r7.J
            r0.c(r8, r10, r9)
            oi3 r0 = r7.M
            r0.c(r8, r10, r9)
            oi3 r0 = r7.L
            r0.c(r8, r10, r9)
        L_0x00ce:
            oi3 r7 = r7.P
            r7.c(r8, r10, r9)
        L_0x00d3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8.e(hj3, int, java.util.ArrayList, o5g):o5g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r8 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r8 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0034, all -> 0x0032 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0034, all -> 0x0032 }
            if (r8 == 0) goto L_0x002c
            boolean r9 = r8.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x002a }
            if (r9 == 0) goto L_0x002c
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x002a }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ IllegalArgumentException -> 0x002a }
            r8.close()
            return r9
        L_0x0027:
            r9 = move-exception
            r7 = r8
            goto L_0x0040
        L_0x002a:
            r9 = move-exception
            goto L_0x0036
        L_0x002c:
            if (r8 == 0) goto L_0x003f
        L_0x002e:
            r8.close()
            goto L_0x003f
        L_0x0032:
            r9 = move-exception
            goto L_0x0040
        L_0x0034:
            r9 = move-exception
            r8 = r7
        L_0x0036:
            java.util.Locale.getDefault()     // Catch:{ all -> 0x0027 }
            r9.getMessage()     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x003f
            goto L_0x002e
        L_0x003f:
            return r7
        L_0x0040:
            if (r7 == 0) goto L_0x0045
            r7.close()
        L_0x0045:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f8.f(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, lq1] */
    /* JADX WARNING: type inference failed for: r1v0, types: [nic, java.lang.Object] */
    public static oq1 g(mq1 mq1) {
        ? obj = new Object();
        obj.c = new Object();
        oq1 oq1 = new oq1(obj);
        obj.b = oq1;
        obj.a = mq1.getClass();
        try {
            String q = mq1.q(obj);
            if (q != null) {
                obj.a = q;
            }
        } catch (Exception e) {
            oq1.b.j(e);
        }
        return oq1;
    }

    public static final nx3 h(ilc ilc) {
        Map map = ilc.k;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = ilc.b;
            if (executor == null) {
                executor = null;
            }
            obj = nd7.s(executor);
            map.put("QueryDispatcher", obj);
        }
        return (nx3) obj;
    }

    public static final nx3 k(ilc ilc) {
        Map map = ilc.k;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            qm qmVar = ilc.c;
            if (qmVar == null) {
                qmVar = null;
            }
            obj = nd7.s(qmVar);
            map.put("TransactionDispatcher", obj);
        }
        return (nx3) obj;
    }

    public static int l(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean m(int i) {
        return (i & 32768) != 0;
    }

    public static boolean n(int i, Object obj) {
        if (!(obj instanceof f66)) {
            return false;
        }
        return (obj instanceof n66 ? ((n66) obj).getArity() : obj instanceof k56 ? 0 : obj instanceof m56 ? 1 : obj instanceof a66 ? 2 : obj instanceof c66 ? 3 : obj instanceof e66 ? 4 : obj instanceof g66 ? 5 : obj instanceof h66 ? 6 : -1) == i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hy8, java.lang.Object] */
    public static iy8 o(ky8 ky8) {
        nw8 nw8;
        ? obj = new Object();
        bu1 bu1 = ky8.a;
        ref ref = null;
        if (bu1 == null) {
            nw8 = null;
        } else {
            nw8 = new nw8(bu1.a, (String) bu1.c, bu1.b);
        }
        obj.a = nw8;
        obj.c = ky8.c;
        obj.b = ky8.b;
        obj.d = ky8.d;
        i20 i20 = ky8.e;
        if (i20 != null) {
            i20 i202 = new i20(1);
            i202.a = i20.a;
            i202.c = i20.c;
            i202.b = i20.b;
            i202.d = i20.d;
            ref = i202.a();
        }
        obj.e = ref;
        return new iy8(obj);
    }

    public static MappedByteBuffer p(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    public static qzd q(gy8 gy8) {
        int i;
        String str;
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
        d5g d5g = null;
        bz bzVar = null;
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
                if (s2 != 0) {
                    if (s2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
            }
            if (str != null) {
                try {
                    if (str.equals("media")) {
                        bzVar = bz.b(gy8);
                    } else if (str.equals("text")) {
                        d5g = r(gy8);
                    } else {
                        gy8.z();
                    }
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
            }
        }
        if (d5g == null) {
            return null;
        }
        return new qzd(bzVar, d5g);
    }

    public static d5g r(gy8 gy8) {
        int i;
        String str;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            Throwable th2 = th;
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th2);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        if (i == 0) {
            return null;
        }
        List list = null;
        String str2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th4);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th4;
                }
            }
            if (str != null) {
                if (str.equals("text")) {
                    try {
                        str2 = lz7.P(gy8);
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th6);
                        }
                        int s3 = au1.s(k7d.a);
                        if (s3 == 0) {
                            str2 = null;
                        } else if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th6;
                        }
                    }
                } else {
                    if (str.equals("elements")) {
                        om8 om8 = new om8(1, lu8.Z, ku8.class, "invoke", "newInstance(Lorg/msgpack/core/MessageUnpacker;)Lru/ok/tamtam/api/commands/base/messages/MessageElement;", 0, 18);
                        CopyOnWriteArraySet copyOnWriteArraySet = u7d.a;
                        list = u7d.b(gy8, nz4.a, om8);
                    } else {
                        gy8 gy82 = gy8;
                        try {
                            gy8.z();
                        } catch (Throwable th7) {
                            Throwable th8 = th7;
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th8);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 != 0) {
                                if (s4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th8;
                            }
                        }
                    }
                }
            }
            gy8 gy83 = gy8;
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        if (str2 != null) {
            return new d5g(str2, list);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static void s(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static final String t(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static e99 v(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = maf.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                if (str.length() != 0) {
                    "Failed to parse Vorbis comment: ".concat(str);
                }
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(rza.a(new yaf(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    fm9.c("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new xqf(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e99((List) arrayList);
    }

    public static boolean w(Parcel parcel) {
        return parcel.readByte() == 1;
    }

    public static String x(Parcel parcel) {
        if (parcel.readByte() == 1) {
            return parcel.readString();
        }
        return null;
    }

    public static hgf y(yaf yaf, boolean z, boolean z2) {
        if (z) {
            F(3, yaf, false);
        }
        yaf.t((int) yaf.m(), b52.c);
        long m = yaf.m();
        String[] strArr = new String[((int) m)];
        for (int i = 0; ((long) i) < m; i++) {
            strArr[i] = yaf.t((int) yaf.m(), b52.c);
        }
        if (!z2 || (yaf.v() & 1) != 0) {
            return new hgf((Object) strArr);
        }
        throw ParserException.a((RuntimeException) null, "framing bit expected to be set");
    }

    public static final int z(c3d c3d, int i) {
        int i2;
        int i3 = i + 1;
        int length = c3d.X.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = c3d.Y[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public final Intent d(Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return (Intent) obj;
            default:
                n37 n37 = (n37) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = n37.b;
                if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        n37 = new n37(n37.a, (Intent) null, n37.c, n37.o);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", n37);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent.toString();
                }
                return intent;
        }
    }

    public o9g i(Context context, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new o9g(1, (Object) oz4.a);
                }
                for (String c2 : strArr) {
                    if (z7.c(context, c2) != 0) {
                        return null;
                    }
                }
                int Z = mz7.Z(strArr.length);
                if (Z < 16) {
                    Z = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
                for (String put : strArr) {
                    linkedHashMap.put(put, Boolean.TRUE);
                }
                return new o9g(1, (Object) linkedHashMap);
            default:
                return j(context, obj);
        }
    }

    public final o9g j(Context context, Object obj) {
        return null;
    }

    public final Object u(Intent intent, int i) {
        switch (this.a) {
            case 0:
                oz4 oz4 = oz4.a;
                if (i != -1 || intent == null) {
                    return oz4;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return oz4;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                int length = intArrayExtra.length;
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
                }
                return mz7.c0(x53.J0(ys.d0(stringArrayExtra), arrayList));
            case 1:
                return new d8(intent, i);
            default:
                return new d8(intent, i);
        }
    }
}
