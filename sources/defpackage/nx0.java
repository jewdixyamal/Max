package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: nx0  reason: default package */
public final class nx0 implements ox0 {
    public final Object X;
    public boolean Y;
    public Object Z;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object o;
    public Object s0;

    public nx0(Context context, adc adc, hi5 hi5) {
        this.a = 3;
        this.b = false;
        this.Y = false;
        this.c = lz7.n(context);
        this.o = adc;
        this.X = hi5;
    }

    public static int g(lx0 lx0, int i) {
        int hashCode = lx0.b.hashCode() + (lx0.a * 31);
        if (i >= 2) {
            return (hashCode * 31) + lx0.e.hashCode();
        }
        long a2 = ct3.a(lx0.e);
        return (hashCode * 31) + ((int) (a2 ^ (a2 >>> 32)));
    }

    public static int j(mx0 mx0, int i) {
        int hashCode = mx0.b.hashCode() + (mx0.a * 31);
        if (i >= 2) {
            return (hashCode * 31) + mx0.e.hashCode();
        }
        long a2 = dt3.a(mx0.e);
        return (hashCode * 31) + ((int) (a2 ^ (a2 >>> 32)));
    }

    private final void m(long j) {
    }

    private final void n(long j) {
    }

    public static lx0 r(int i, DataInputStream dataInputStream) {
        a94 a94;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            h7b h7b = new h7b(13);
            h7b.e(Long.valueOf(readLong), "exo_len");
            a94 = a94.c.b(h7b);
        } else {
            int readInt2 = dataInputStream.readInt();
            HashMap hashMap = new HashMap();
            int i2 = 0;
            while (i2 < readInt2) {
                String readUTF2 = dataInputStream.readUTF();
                int readInt3 = dataInputStream.readInt();
                if (readInt3 >= 0) {
                    int min = Math.min(readInt3, 10485760);
                    byte[] bArr = maf.f;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        int i4 = i3 + min;
                        bArr = Arrays.copyOf(bArr, i4);
                        dataInputStream.readFully(bArr, i3, min);
                        min = Math.min(readInt3 - i4, 10485760);
                        i3 = i4;
                    }
                    hashMap.put(readUTF2, bArr);
                    i2++;
                } else {
                    throw new IOException(z7b.h(31, readInt3, "Invalid value size: "));
                }
            }
            a94 = new a94(hashMap);
        }
        return new lx0(readInt, readUTF, a94);
    }

    public static mx0 s(int i, DataInputStream dataInputStream) {
        b94 b94;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            imc imc = new imc(13);
            imc.M(Long.valueOf(readLong), "exo_len");
            b94 = b94.c.b(imc);
        } else {
            b94 = bwf.c(dataInputStream);
        }
        return new mx0(readInt, readUTF, b94);
    }

    public void a(HashMap hashMap) {
        DataOutputStream dataOutputStream;
        Object obj = this.o;
        Object obj2 = this.X;
        DataOutputStream dataOutputStream2 = null;
        Object obj3 = this.c;
        switch (this.a) {
            case 0:
                Cipher cipher = (Cipher) obj3;
                h7b h7b = (h7b) this.Z;
                try {
                    xy y = h7b.y();
                    bkc bkc = (bkc) this.s0;
                    if (bkc == null) {
                        this.s0 = new bkc(y, 0);
                    } else {
                        bkc.a(y);
                    }
                    bkc bkc2 = (bkc) this.s0;
                    DataOutputStream dataOutputStream3 = new DataOutputStream(bkc2);
                    try {
                        dataOutputStream3.writeInt(2);
                        boolean z = this.b;
                        dataOutputStream3.writeInt(z ? 1 : 0);
                        if (z) {
                            byte[] bArr = new byte[16];
                            int i = maf.a;
                            ((SecureRandom) obj2).nextBytes(bArr);
                            dataOutputStream3.write(bArr);
                            cipher.init(1, (SecretKeySpec) obj, new IvParameterSpec(bArr));
                            dataOutputStream3.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(bkc2, cipher));
                        } else {
                            dataOutputStream = dataOutputStream3;
                        }
                        dataOutputStream2.writeInt(hashMap.size());
                        int i2 = 0;
                        for (lx0 lx0 : hashMap.values()) {
                            dataOutputStream2.writeInt(lx0.a);
                            dataOutputStream2.writeUTF(lx0.b);
                            x99.f(lx0.e, dataOutputStream2);
                            i2 += g(lx0, 2);
                        }
                        dataOutputStream2.writeInt(i2);
                        dataOutputStream2.close();
                        ((File) h7b.c).delete();
                        int i3 = maf.a;
                        this.Y = false;
                        return;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream2 = dataOutputStream3;
                        maf.h(dataOutputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    maf.h(dataOutputStream2);
                    throw th;
                }
            default:
                Cipher cipher2 = (Cipher) obj3;
                imc imc = (imc) this.Z;
                try {
                    xy a0 = imc.a0();
                    bkc bkc3 = (bkc) this.s0;
                    if (bkc3 == null) {
                        this.s0 = new bkc(a0, 1);
                    } else {
                        bkc3.a(a0);
                    }
                    bkc bkc4 = (bkc) this.s0;
                    DataOutputStream dataOutputStream4 = new DataOutputStream(bkc4);
                    try {
                        dataOutputStream4.writeInt(2);
                        boolean z2 = this.b;
                        dataOutputStream4.writeInt(z2 ? 1 : 0);
                        if (z2) {
                            byte[] bArr2 = new byte[16];
                            int i4 = oaf.a;
                            ((SecureRandom) obj2).nextBytes(bArr2);
                            dataOutputStream4.write(bArr2);
                            cipher2.init(1, (SecretKeySpec) obj, new IvParameterSpec(bArr2));
                            dataOutputStream4.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(bkc4, cipher2));
                        } else {
                            dataOutputStream2 = dataOutputStream4;
                        }
                        dataOutputStream2.writeInt(hashMap.size());
                        int i5 = 0;
                        for (mx0 mx0 : hashMap.values()) {
                            dataOutputStream2.writeInt(mx0.a);
                            dataOutputStream2.writeUTF(mx0.b);
                            bwf.d(mx0.e, dataOutputStream2);
                            i5 += j(mx0, 2);
                        }
                        dataOutputStream2.writeInt(i5);
                        dataOutputStream2.close();
                        ((File) imc.c).delete();
                        int i6 = oaf.a;
                        this.Y = false;
                        return;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                        throw new IllegalStateException(e2);
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream2 = dataOutputStream4;
                        oaf.h(dataOutputStream2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    oaf.h(dataOutputStream2);
                    throw th;
                }
        }
    }

    public void b() {
        synchronized (this.Z) {
            this.Y = true;
            ((ArrayDeque) this.s0).clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((ExecutorService) this.c).submit(new av2((Object) this, true, (Object) new i12(this, 5, countDownLatch), 6));
        countDownLatch.await();
    }

    public void c(mx0 mx0, boolean z) {
        this.Y = true;
    }

    public void d(Exception exc) {
        synchronized (this.Z) {
            try {
                if (!this.Y) {
                    this.Y = true;
                    ((wff) this.X).c(VideoFrameProcessingException.a(exc));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void e(mx0 mx0) {
        this.Y = true;
    }

    public boolean f() {
        switch (this.a) {
            case 0:
                h7b h7b = (h7b) this.Z;
                return ((File) h7b.b).exists() || ((File) h7b.c).exists();
            default:
                imc imc = (imc) this.Z;
                return ((File) imc.b).exists() || ((File) imc.c).exists();
        }
    }

    public void h(HashMap hashMap) {
        switch (this.a) {
            case 0:
                if (this.Y) {
                    a(hashMap);
                    return;
                }
                return;
            default:
                if (this.Y) {
                    a(hashMap);
                    return;
                }
                return;
        }
    }

    public void i(long j) {
        int i = this.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(java.util.HashMap r14, android.util.SparseArray r15) {
        /*
            r13 = this;
            r0 = -1
            r1 = 0
            java.lang.Object r2 = r13.o
            r3 = 16
            java.lang.Object r4 = r13.c
            r5 = 2
            r6 = 0
            r7 = 1
            int r8 = r13.a
            switch(r8) {
                case 0: goto L_0x00e9;
                default: goto L_0x0010;
            }
        L_0x0010:
            boolean r8 = r13.Y
            r8 = r8 ^ r7
            defpackage.fm9.k(r8)
            java.lang.Object r8 = r13.Z
            imc r8 = (defpackage.imc) r8
            java.lang.Object r9 = r8.b
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r8.b
            java.io.File r10 = (java.io.File) r10
            boolean r9 = r9.exists()
            java.lang.Object r8 = r8.c
            java.io.File r8 = (java.io.File) r8
            if (r9 != 0) goto L_0x0032
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x00e8
        L_0x0032:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            boolean r11 = r8.exists()     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            if (r11 == 0) goto L_0x0040
            r10.delete()     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            r8.renameTo(r10)     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
        L_0x0040:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            r11.<init>(r9)     // Catch:{ IOException -> 0x00d7, all -> 0x00d0 }
            int r6 = r11.readInt()     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            if (r6 < 0) goto L_0x0061
            if (r6 <= r5) goto L_0x0056
            goto L_0x0061
        L_0x0056:
            int r12 = r11.readInt()     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r12 = r12 & r7
            if (r12 == 0) goto L_0x008e
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            if (r4 != 0) goto L_0x0066
        L_0x0061:
            defpackage.oaf.h(r11)
            goto L_0x00dc
        L_0x0066:
            byte[] r13 = new byte[r3]     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r11.readFully(r13)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r3.<init>(r13)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            javax.crypto.spec.SecretKeySpec r2 = (javax.crypto.spec.SecretKeySpec) r2     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0087 }
            int r13 = defpackage.oaf.a     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0087 }
            r4.init(r5, r2, r3)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0087 }
            java.io.DataInputStream r13 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            javax.crypto.CipherInputStream r2 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r2.<init>(r9, r4)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r13.<init>(r2)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            goto L_0x0095
        L_0x0082:
            r13 = move-exception
            r6 = r11
            goto L_0x00d1
        L_0x0085:
            r6 = r11
            goto L_0x00d7
        L_0x0087:
            r13 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            r0.<init>(r13)     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            throw r0     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
        L_0x008e:
            boolean r2 = r13.b     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
            if (r2 == 0) goto L_0x0094
            r13.Y = r7     // Catch:{ IOException -> 0x0085, all -> 0x0082 }
        L_0x0094:
            r13 = r11
        L_0x0095:
            int r2 = r13.readInt()     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            r3 = r1
            r4 = r3
        L_0x009b:
            if (r3 >= r2) goto L_0x00b8
            mx0 r5 = s(r6, r13)     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            java.lang.String r9 = r5.b
            r14.put(r9, r5)     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            int r11 = r5.a     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            r15.put(r11, r9)     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            int r5 = j(r5, r6)     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            int r4 = r4 + r5
            int r3 = r3 + r7
            goto L_0x009b
        L_0x00b2:
            r14 = move-exception
            r6 = r13
            r13 = r14
            goto L_0x00d1
        L_0x00b6:
            r6 = r13
            goto L_0x00d7
        L_0x00b8:
            int r2 = r13.readInt()     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            int r3 = r13.read()     // Catch:{ IOException -> 0x00b6, all -> 0x00b2 }
            if (r3 != r0) goto L_0x00c3
            r1 = r7
        L_0x00c3:
            if (r2 != r4) goto L_0x00cc
            if (r1 != 0) goto L_0x00c8
            goto L_0x00cc
        L_0x00c8:
            defpackage.oaf.h(r13)
            goto L_0x00e8
        L_0x00cc:
            defpackage.oaf.h(r13)
            goto L_0x00dc
        L_0x00d0:
            r13 = move-exception
        L_0x00d1:
            if (r6 == 0) goto L_0x00d6
            defpackage.oaf.h(r6)
        L_0x00d6:
            throw r13
        L_0x00d7:
            if (r6 == 0) goto L_0x00dc
            defpackage.oaf.h(r6)
        L_0x00dc:
            r14.clear()
            r15.clear()
            r10.delete()
            r8.delete()
        L_0x00e8:
            return
        L_0x00e9:
            boolean r8 = r13.Y
            r8 = r8 ^ r7
            defpackage.np8.f(r8)
            java.lang.Object r8 = r13.Z
            h7b r8 = (defpackage.h7b) r8
            java.lang.Object r9 = r8.b
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r8.b
            java.io.File r10 = (java.io.File) r10
            boolean r9 = r9.exists()
            java.lang.Object r8 = r8.c
            java.io.File r8 = (java.io.File) r8
            if (r9 != 0) goto L_0x010b
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x01c1
        L_0x010b:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            boolean r11 = r8.exists()     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            if (r11 == 0) goto L_0x0119
            r10.delete()     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            r8.renameTo(r10)     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
        L_0x0119:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            r11.<init>(r9)     // Catch:{ IOException -> 0x01b0, all -> 0x01a9 }
            int r6 = r11.readInt()     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            if (r6 < 0) goto L_0x013a
            if (r6 <= r5) goto L_0x012f
            goto L_0x013a
        L_0x012f:
            int r12 = r11.readInt()     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r12 = r12 & r7
            if (r12 == 0) goto L_0x0167
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            if (r4 != 0) goto L_0x013f
        L_0x013a:
            defpackage.maf.h(r11)
            goto L_0x01b5
        L_0x013f:
            byte[] r13 = new byte[r3]     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r11.readFully(r13)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r3.<init>(r13)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            javax.crypto.spec.SecretKeySpec r2 = (javax.crypto.spec.SecretKeySpec) r2     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0160 }
            int r13 = defpackage.maf.a     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0160 }
            r4.init(r5, r2, r3)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException -> 0x0160 }
            java.io.DataInputStream r13 = new java.io.DataInputStream     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            javax.crypto.CipherInputStream r2 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r2.<init>(r9, r4)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r13.<init>(r2)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            goto L_0x016e
        L_0x015b:
            r13 = move-exception
            r6 = r11
            goto L_0x01aa
        L_0x015e:
            r6 = r11
            goto L_0x01b0
        L_0x0160:
            r13 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            r0.<init>(r13)     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            throw r0     // Catch:{ IOException -> 0x015e, all -> 0x015b }
        L_0x0167:
            boolean r2 = r13.b     // Catch:{ IOException -> 0x015e, all -> 0x015b }
            if (r2 == 0) goto L_0x016d
            r13.Y = r7     // Catch:{ IOException -> 0x015e, all -> 0x015b }
        L_0x016d:
            r13 = r11
        L_0x016e:
            int r2 = r13.readInt()     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            r3 = r1
            r4 = r3
        L_0x0174:
            if (r3 >= r2) goto L_0x0191
            lx0 r5 = r(r6, r13)     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            java.lang.String r9 = r5.b
            r14.put(r9, r5)     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            int r11 = r5.a     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            r15.put(r11, r9)     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            int r5 = g(r5, r6)     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            int r4 = r4 + r5
            int r3 = r3 + r7
            goto L_0x0174
        L_0x018b:
            r14 = move-exception
            r6 = r13
            r13 = r14
            goto L_0x01aa
        L_0x018f:
            r6 = r13
            goto L_0x01b0
        L_0x0191:
            int r2 = r13.readInt()     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            int r3 = r13.read()     // Catch:{ IOException -> 0x018f, all -> 0x018b }
            if (r3 != r0) goto L_0x019c
            r1 = r7
        L_0x019c:
            if (r2 != r4) goto L_0x01a5
            if (r1 != 0) goto L_0x01a1
            goto L_0x01a5
        L_0x01a1:
            defpackage.maf.h(r13)
            goto L_0x01c1
        L_0x01a5:
            defpackage.maf.h(r13)
            goto L_0x01b5
        L_0x01a9:
            r13 = move-exception
        L_0x01aa:
            if (r6 == 0) goto L_0x01af
            defpackage.maf.h(r6)
        L_0x01af:
            throw r13
        L_0x01b0:
            if (r6 == 0) goto L_0x01b5
            defpackage.maf.h(r6)
        L_0x01b5:
            r14.clear()
            r15.clear()
            r10.delete()
            r8.delete()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx0.k(java.util.HashMap, android.util.SparseArray):void");
    }

    public void l() {
        switch (this.a) {
            case 0:
                h7b h7b = (h7b) this.Z;
                ((File) h7b.b).delete();
                ((File) h7b.c).delete();
                return;
            default:
                imc imc = (imc) this.Z;
                ((File) imc.b).delete();
                ((File) imc.c).delete();
                return;
        }
    }

    public void o(i12 i12) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (Thread.currentThread() == ((Thread) ((Future) this.o).get(500, timeUnit))) {
                try {
                    i12.run();
                } catch (Exception e) {
                    d(e);
                }
            } else {
                try {
                    ((ExecutorService) this.c).submit(new fre(this, 9, i12)).get(500, timeUnit);
                } catch (RuntimeException | ExecutionException | TimeoutException e2) {
                    d(e2);
                }
            }
        } catch (InterruptedException e3) {
            throw e3;
        } catch (Exception e4) {
            d(e4);
        }
    }

    public void p(lx0 lx0, boolean z) {
        this.Y = true;
    }

    public void q(lx0 lx0) {
        this.Y = true;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public void t(xff xff) {
        synchronized (this.Z) {
            this.Y = true;
            ((ArrayDeque) this.s0).clear();
        }
        ((ExecutorService) this.c).submit(new av2((Object) this, true, (Object) xff, 6));
        if (this.b) {
            ((ExecutorService) this.c).shutdown();
            if (!((ExecutorService) this.c).awaitTermination(500, TimeUnit.MILLISECONDS)) {
                ((wff) this.X).c(new Exception("Release timed out. OpenGL resources may not be cleaned up properly."));
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r6 = r0;
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.cdc u(java.util.concurrent.Executor r17, defpackage.tj3 r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "Listener Executor can't be null."
            defpackage.c54.o(r0, r2)
            r1.s0 = r0
            r0 = r18
            r1.Z = r0
            java.lang.Object r0 = r1.o
            r2 = r0
            adc r2 = (defpackage.adc) r2
            r2.getClass()
            java.lang.Object r3 = r2.h
            monitor-enter(r3)
            long r4 = r2.p     // Catch:{ all -> 0x0033 }
            r6 = 1
            long r4 = r4 + r6
            r2.p = r4     // Catch:{ all -> 0x0033 }
            zcc r0 = r2.k     // Catch:{ all -> 0x0033 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0033 }
            r7 = 0
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0036;
                case 2: goto L_0x0036;
                case 3: goto L_0x003c;
                case 4: goto L_0x002d;
                case 5: goto L_0x002d;
                case 6: goto L_0x003c;
                case 7: goto L_0x003c;
                case 8: goto L_0x003c;
                default: goto L_0x002b;
            }     // Catch:{ all -> 0x0033 }
        L_0x002b:
            goto L_0x00a7
        L_0x002d:
            nb0 r0 = r2.n     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r6 = r0
            r0 = 0
            goto L_0x00ac
        L_0x0033:
            r0 = move-exception
            goto L_0x00ff
        L_0x0036:
            nb0 r0 = r2.o     // Catch:{ all -> 0x0033 }
            r0.getClass()     // Catch:{ all -> 0x0033 }
            goto L_0x002f
        L_0x003c:
            zcc r0 = r2.k     // Catch:{ all -> 0x0033 }
            zcc r14 = defpackage.zcc.o     // Catch:{ all -> 0x0033 }
            if (r0 != r14) goto L_0x0052
            nb0 r0 = r2.n     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x004c
            nb0 r0 = r2.o     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = r7
        L_0x004d:
            java.lang.String r8 = "Expected recorder to be idle but a recording is either pending or in progress."
            defpackage.c54.p(r8, r0)     // Catch:{ all -> 0x0033 }
        L_0x0052:
            nb0 r0 = new nb0     // Catch:{ IOException -> 0x008b }
            java.lang.Object r8 = r1.X     // Catch:{ IOException -> 0x008b }
            r9 = r8
            hi5 r9 = (defpackage.hi5) r9     // Catch:{ IOException -> 0x008b }
            java.lang.Object r8 = r1.s0     // Catch:{ IOException -> 0x008b }
            r10 = r8
            java.util.concurrent.Executor r10 = (java.util.concurrent.Executor) r10     // Catch:{ IOException -> 0x008b }
            java.lang.Object r8 = r1.Z     // Catch:{ IOException -> 0x008b }
            r11 = r8
            tj3 r11 = (defpackage.tj3) r11     // Catch:{ IOException -> 0x008b }
            boolean r12 = r1.b     // Catch:{ IOException -> 0x008b }
            boolean r13 = r1.Y     // Catch:{ IOException -> 0x008b }
            r8 = r0
            r6 = r14
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x008b }
            java.lang.Object r8 = r1.c     // Catch:{ IOException -> 0x008b }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ IOException -> 0x008b }
            r0.g(r8)     // Catch:{ IOException -> 0x008b }
            r2.o = r0     // Catch:{ IOException -> 0x008b }
            zcc r0 = r2.k     // Catch:{ IOException -> 0x008b }
            if (r0 != r6) goto L_0x008d
            zcc r0 = defpackage.zcc.b     // Catch:{ IOException -> 0x008b }
            r2.B(r0)     // Catch:{ IOException -> 0x008b }
            q6d r0 = r2.e     // Catch:{ IOException -> 0x008b }
            rcc r6 = new rcc     // Catch:{ IOException -> 0x008b }
            r8 = 0
            r6.<init>(r2, r8)     // Catch:{ IOException -> 0x008b }
            r0.execute(r6)     // Catch:{ IOException -> 0x008b }
            goto L_0x00a7
        L_0x008b:
            r0 = move-exception
            goto L_0x00aa
        L_0x008d:
            zcc r6 = defpackage.zcc.t0     // Catch:{ IOException -> 0x008b }
            if (r0 != r6) goto L_0x00a2
            zcc r0 = defpackage.zcc.b     // Catch:{ IOException -> 0x008b }
            r2.B(r0)     // Catch:{ IOException -> 0x008b }
            q6d r0 = r2.e     // Catch:{ IOException -> 0x008b }
            rcc r6 = new rcc     // Catch:{ IOException -> 0x008b }
            r8 = 1
            r6.<init>(r2, r8)     // Catch:{ IOException -> 0x008b }
            r0.execute(r6)     // Catch:{ IOException -> 0x008b }
            goto L_0x00a7
        L_0x00a2:
            zcc r0 = defpackage.zcc.b     // Catch:{ IOException -> 0x008b }
            r2.B(r0)     // Catch:{ IOException -> 0x008b }
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r6 = 0
            goto L_0x00ac
        L_0x00aa:
            r7 = 5
            goto L_0x00a8
        L_0x00ac:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r6 != 0) goto L_0x00f7
            if (r7 == 0) goto L_0x00e4
            java.util.Objects.toString(r0)
            nb0 r3 = new nb0
            java.lang.Object r6 = r1.X
            r9 = r6
            hi5 r9 = (defpackage.hi5) r9
            java.lang.Object r6 = r1.s0
            r10 = r6
            java.util.concurrent.Executor r10 = (java.util.concurrent.Executor) r10
            java.lang.Object r6 = r1.Z
            r11 = r6
            tj3 r11 = (defpackage.tj3) r11
            boolean r12 = r1.b
            boolean r13 = r1.Y
            r8 = r3
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.j(r3, r7, r0)
            cdc r0 = new cdc
            java.lang.Object r2 = r1.o
            r9 = r2
            adc r9 = (defpackage.adc) r9
            java.lang.Object r1 = r1.X
            r12 = r1
            hi5 r12 = (defpackage.hi5) r12
            r13 = 1
            r8 = r0
            r10 = r4
            r8.<init>(r9, r10, r12, r13)
            goto L_0x00f6
        L_0x00e4:
            cdc r0 = new cdc
            java.lang.Object r2 = r1.o
            r9 = r2
            adc r9 = (defpackage.adc) r9
            java.lang.Object r1 = r1.X
            r12 = r1
            hi5 r12 = (defpackage.hi5) r12
            r13 = 0
            r8 = r0
            r10 = r4
            r8.<init>(r9, r10, r12, r13)
        L_0x00f6:
            return r0
        L_0x00f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "A recording is already in progress. Previous recordings must be stopped before a new recording can be started."
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx0.u(java.util.concurrent.Executor, tj3):cdc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(defpackage.xff r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.Z
            monitor-enter(r0)
            boolean r1 = r4.Y     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r4 = move-exception
            goto L_0x0023
        L_0x000b:
            av2 r1 = new av2     // Catch:{ RejectedExecutionException -> 0x001b }
            r2 = 0
            r3 = 6
            r1.<init>((java.lang.Object) r4, (boolean) r2, (java.lang.Object) r5, (int) r3)     // Catch:{ RejectedExecutionException -> 0x001b }
            java.lang.Object r5 = r4.c     // Catch:{ RejectedExecutionException -> 0x001b }
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5     // Catch:{ RejectedExecutionException -> 0x001b }
            r5.submit(r1)     // Catch:{ RejectedExecutionException -> 0x001b }
            r5 = 0
            goto L_0x001c
        L_0x001b:
            r5 = move-exception
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            if (r5 == 0) goto L_0x0022
            r4.d(r5)
        L_0x0022:
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx0.v(xff):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [xff, java.lang.Object] */
    public void w(xff xff) {
        synchronized (this.Z) {
            try {
                if (!this.Y) {
                    ((ArrayDeque) this.s0).add(xff);
                    v(new Object());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void x() {
        if (ngg.m((Context) this.c, "android.permission.RECORD_AUDIO") != -1) {
            c54.p("The Recorder this recording is associated to doesn't support audio.", ((ab0) adc.l(((adc) this.o).D)).b.e != 0);
            this.b = true;
            return;
        }
        throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
    }

    public nx0(st1 st1, q6d q6d) {
        this.a = 2;
        this.b = false;
        this.Y = false;
        this.X = new Object();
        this.Z = new re6(7);
        this.c = st1;
        this.o = q6d;
    }

    public nx0(ExecutorService executorService, boolean z, wff wff) {
        this.a = 4;
        this.c = executorService;
        this.o = executorService.submit(new ae(2));
        this.b = z;
        this.X = wff;
        this.Z = new Object();
        this.s0 = new ArrayDeque();
    }

    public nx0(File file, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = false;
                this.c = null;
                this.o = null;
                this.X = null;
                this.Z = new imc(file);
                return;
            default:
                this.b = false;
                this.c = null;
                this.o = null;
                this.X = null;
                this.Z = new h7b(file);
                return;
        }
    }
}
