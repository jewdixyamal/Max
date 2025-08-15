package defpackage;

import android.content.ClipData;
import android.graphics.PointF;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContentInfo;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLSocket;
import kotlin.coroutines.Continuation;
import org.apache.http.util.LangUtils;
import org.webrtc.CameraVideoCapturer;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: wd6  reason: default package */
public final class wd6 implements eg4, lv, vg1, x85, qj3, at3, do7, a76, mq1, nq8, n99, ihb, CameraVideoCapturer.CameraEventsHandler, lxd {
    public static volatile wd6 c;
    public static final int[] o = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ wd6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static wd6 w(ce3 ce3) {
        wd6 wd6 = new wd6(7);
        ce3.e(new f9(wd6, 17, ce3));
        return wd6;
    }

    public void A(sg8 sg8, zf8 zf8, ArrayList arrayList) {
        ah8 ah8 = (ah8) this.b;
        if (sg8 == ah8.u && zf8 != null) {
            ch8 ch8 = ah8.t.a;
            String c2 = zf8.c();
            dh8 dh8 = new dh8(ch8, c2, ah8.b(ch8, c2));
            dh8.i(zf8);
            if (ah8.r != dh8) {
                sg8 sg82 = ah8.u;
                dh8 dh82 = ah8.t;
                bh8 bh8 = ah8.z;
                if (bh8 != null) {
                    if (!bh8.i && !bh8.j) {
                        bh8.j = true;
                        tg8 tg8 = bh8.a;
                        if (tg8 != null) {
                            tg8.h(0);
                            tg8.d();
                        }
                    }
                    ah8.z = null;
                }
                bh8 bh82 = new bh8(ah8, dh8, sg82, 3, dh82, arrayList);
                ah8.z = bh82;
                bh82.a();
                ah8.t = null;
                ah8.u = null;
            }
        } else if (sg8 == ah8.s) {
            if (zf8 != null) {
                ah8.m(ah8.r, zf8);
            }
            ah8.r.n(arrayList);
        }
    }

    public f99 B(sa4 sa4, ys6 ys6) {
        wpa wpa = (wpa) this.b;
        f99 f99 = null;
        int i = 0;
        while (true) {
            try {
                sa4.q(wpa.a, 0, 10, false);
                wpa.G(0);
                if (wpa.x() != 4801587) {
                    break;
                }
                wpa.H(3);
                int t = wpa.t();
                int i2 = t + 10;
                if (f99 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(wpa.a, 0, bArr, 0, 10);
                    sa4.q(bArr, 10, t, false);
                    f99 = new bt6(ys6).X(i2, bArr);
                } else {
                    sa4.b(t, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        sa4.Y = 0;
        sa4.b(i, false);
        return f99;
    }

    public b11 C(go7 go7, long j, long j2, IOException iOException, int i) {
        long j3;
        bqa bqa = (bqa) go7;
        y14 y14 = (y14) this.b;
        y14.getClass();
        long j4 = bqa.a;
        Uri uri = bqa.o.c;
        yn7 yn7 = new yn7(j2);
        y14.m.getClass();
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException instanceof Loader$UnexpectedLoaderException)) {
            int i2 = DataSourceException.b;
            Throwable th = iOException;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        b11 b11 = j3 == -9223372036854775807L ? vq7.Z : new b11(j3, 0, 5, false);
        y14.q.C(yn7, bqa.c, iOException, !b11.a());
        return b11;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [b28, java.lang.Object] */
    public void D(int i, long j, long j2) {
        d28 d28 = (d28) this.b;
        fm9.l(d28.o1);
        if (i == 160) {
            d28.d1 = false;
            d28.e1 = 0;
        } else if (i == 174) {
            ? obj = new Object();
            obj.m = -1;
            obj.n = -1;
            obj.o = -1;
            obj.p = -1;
            obj.q = -1;
            obj.r = 0;
            obj.s = -1;
            obj.t = 0.0f;
            obj.u = 0.0f;
            obj.v = 0.0f;
            obj.w = null;
            obj.x = -1;
            obj.y = false;
            obj.z = -1;
            obj.A = -1;
            obj.B = -1;
            obj.C = 1000;
            obj.D = 200;
            obj.E = -1.0f;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.N = -1.0f;
            obj.P = 1;
            obj.Q = -1;
            obj.R = 8000;
            obj.S = 0;
            obj.T = 0;
            obj.W = true;
            obj.X = "eng";
            d28.H0 = obj;
        } else if (i == 187) {
            d28.R0 = false;
        } else if (i == 19899) {
            d28.J0 = -1;
            d28.K0 = -1;
        } else if (i == 20533) {
            d28.b(i);
            d28.H0.h = true;
        } else if (i == 21968) {
            d28.b(i);
            d28.H0.y = true;
        } else if (i == 408125543) {
            long j3 = d28.D0;
            if (j3 == -1 || j3 == j) {
                d28.D0 = j;
                d28.C0 = j2;
                return;
            }
            throw ParserException.a((RuntimeException) null, "Multiple Segment elements not supported");
        } else if (i == 475249515) {
            d28.P0 = new nv7(1);
            d28.Q0 = new nv7(1);
        } else if (i != 524531317 || d28.I0) {
        } else {
            if (!d28.o || d28.M0 == -1) {
                d28.o1.J(new wd0(d28.G0));
                d28.I0 = true;
                return;
            }
            d28.L0 = true;
        }
    }

    public vh9 F() {
        throw null;
    }

    public kxd Q() {
        return (b46) this.b;
    }

    public void T(float f, float f2) {
        bc7[] bc7Arr = xg1.x0;
        PointF pointF = ((xg1) this.b).s0;
        pointF.x = f;
        pointF.y = f2;
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                List list = (List) obj;
                zb2 zb2 = (zb2) this.b;
                x77 x77 = zb2.I0;
                if (x77 != null) {
                    x77.cancel((CancellationException) null);
                }
                zb2.J0.set(true);
                nb2 nb2 = new nb2(list, zb2, (Continuation) null);
                zb2.I0 = j47.T(zb2.Z, (nx3) zb2.b.getValue(), (vx3) null, nb2, 2);
                return;
            default:
                hm9.p(((s8d) this.b).X, "Error while runAfterDelay", (Throwable) obj);
                return;
        }
    }

    public boolean b(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return eae.o0(name, ((String) this.b) + '.', false);
    }

    public ClipData c() {
        return ((ContentInfo) this.b).getClip();
    }

    public void d(Throwable th) {
        boolean z = th instanceof MediaCodec.CodecException;
        re6 re6 = (re6) this.b;
        if (z) {
            d15 d15 = (d15) re6.b;
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            d15.getClass();
            d15.b(1, codecException.getMessage(), codecException);
            return;
        }
        ((d15) re6.b).b(0, th.getMessage(), th);
    }

    public long e() {
        return (long) ((ByteBuffer) this.b).position();
    }

    public void f(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
            Throwable th = (Throwable) serializable;
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    public Uri g() {
        return ((ContentInfo) this.b).getLinkUri();
    }

    public Bundle getExtras() {
        return ((ContentInfo) this.b).getExtras();
    }

    public int getFlags() {
        return ((ContentInfo) this.b).getFlags();
    }

    public void h(Object obj) {
        ww0 ww0 = (ww0) obj;
        ((pq9) this.b).getClass();
    }

    public e5f h0(long j, List list) {
        boolean isEmpty = list.isEmpty();
        e5f e5f = e5f.a;
        if (isEmpty) {
            return e5f;
        }
        ((bx) this.b).B();
        ((bx) this.b).o(j, list, true, false);
        return e5f;
    }

    public void i(Object obj) {
        ww0 ww0 = (ww0) obj;
        ((pq9) this.b).getClass();
    }

    public int j() {
        return ((ByteBuffer) this.b).getInt();
    }

    public void k(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    public oud l(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new de(cls2);
    }

    public void m(go7 go7, long j, long j2, boolean z) {
        ((y14) this.b).w((bqa) go7, j, j2);
    }

    public void n(Object obj) {
        ww0 ww0 = (ww0) obj;
        ((pq9) this.b).getClass();
    }

    public long o() {
        return ((long) ((ByteBuffer) this.b).getInt()) & 4294967295L;
    }

    public void onCameraClosed() {
    }

    public void onCameraDisconnected() {
    }

    public void onCameraError(String str) {
        ((a4c) this.b).reportException("OKRTCSvcFactory", wg0.i("onCameraError(): ", str), new RuntimeException(wg0.i("Camera error: ", str)));
    }

    public void onCameraFreezed(String str) {
        ((a4c) this.b).log("OKRTCSvcFactory", "onCameraFreezed(): " + str);
    }

    public void onCameraOpening(String str) {
    }

    public void onFirstFrameAvailable() {
    }

    public ContentInfo p() {
        return (ContentInfo) this.b;
    }

    public String q(lq1 lq1) {
        b76 b76 = (b76) this.b;
        c54.p("The result can only set once!", b76.b == null);
        b76.b = lq1;
        return "FutureChain[" + b76 + "]";
    }

    public int r() {
        return ((ContentInfo) this.b).getSource();
    }

    public int readUnsignedShort() {
        return ((ByteBuffer) this.b).getShort() & 65535;
    }

    public void s(int i, boolean z) {
        rm5 rm5 = (rm5) this.b;
        if (z) {
            rm5.a(i);
        } else {
            rm5.getClass();
        }
    }

    public void t(int i, int i2, sa4 sa4) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        sa4 sa42 = sa4;
        d28 d28 = (d28) this.b;
        SparseArray sparseArray = d28.c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i7 == 161 || i7 == 163) {
            int i12 = d28.T0;
            wpa wpa = d28.t0;
            if (i12 == 0) {
                yaf yaf = d28.b;
                d28.Z0 = (int) yaf.C(sa42, false, true, 8);
                d28.a1 = yaf.c;
                d28.V0 = -9223372036854775807L;
                d28.T0 = 1;
                wpa.D(0);
            }
            b28 b28 = (b28) sparseArray.get(d28.Z0);
            if (b28 == null) {
                sa42.z(i8 - d28.a1);
                d28.T0 = 0;
                return;
            }
            b28.Y.getClass();
            if (d28.T0 == 1) {
                d28.f(sa42, 3);
                int i13 = (wpa.a[2] & 6) >> 1;
                if (i13 == 0) {
                    d28.X0 = 1;
                    int[] iArr = d28.Y0;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    d28.Y0 = iArr;
                    iArr[0] = (i8 - d28.a1) - 3;
                } else {
                    d28.f(sa42, 4);
                    int i14 = (wpa.a[3] & 255) + 1;
                    d28.X0 = i14;
                    int[] iArr2 = d28.Y0;
                    if (iArr2 == null) {
                        iArr2 = new int[i14];
                    } else if (iArr2.length < i14) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i14)];
                    }
                    d28.Y0 = iArr2;
                    if (i13 == 2) {
                        int i15 = d28.X0;
                        Arrays.fill(iArr2, 0, i15, ((i8 - d28.a1) - 4) / i15);
                    } else if (i13 == 1) {
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i4 = d28.X0 - 1;
                            if (i16 >= i4) {
                                break;
                            }
                            d28.Y0[i16] = 0;
                            while (true) {
                                i5 = i9 + 1;
                                d28.f(sa42, i5);
                                byte b2 = wpa.a[i9] & 255;
                                int[] iArr3 = d28.Y0;
                                i6 = iArr3[i16] + b2;
                                iArr3[i16] = i6;
                                if (b2 != 255) {
                                    break;
                                }
                                i9 = i5;
                            }
                            i17 += i6;
                            i16++;
                            i9 = i5;
                        }
                        d28.Y0[i4] = ((i8 - d28.a1) - i9) - i17;
                    } else if (i13 == 3) {
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = d28.X0 - i11;
                            if (i18 >= i20) {
                                d28.Y0[i20] = ((i8 - d28.a1) - i9) - i19;
                                break;
                            }
                            d28.Y0[i18] = i10;
                            int i21 = i9 + 1;
                            d28.f(sa42, i21);
                            if (wpa.a[i9] != 0) {
                                int i22 = i10;
                                int i23 = 8;
                                while (true) {
                                    if (i22 >= i23) {
                                        j = 0;
                                        i9 = i21;
                                        break;
                                    }
                                    int i24 = i11 << (7 - i22);
                                    if ((wpa.a[i9] & i24) != 0) {
                                        int i25 = i21 + i22;
                                        d28.f(sa42, i25);
                                        j = (long) (wpa.a[i9] & 255 & (~i24));
                                        while (i21 < i25) {
                                            j = (j << 8) | ((long) (wpa.a[i21] & 255));
                                            i21++;
                                            i25 = i25;
                                        }
                                        int i26 = i25;
                                        if (i18 > 0) {
                                            j -= (1 << ((i22 * 7) + 6)) - 1;
                                        }
                                        i9 = i26;
                                    } else {
                                        i22++;
                                        i23 = 8;
                                        i11 = 1;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i27 = (int) j;
                                    int[] iArr4 = d28.Y0;
                                    if (i18 != 0) {
                                        i27 += iArr4[i18 - 1];
                                    }
                                    iArr4[i18] = i27;
                                    i19 += i27;
                                    i18++;
                                    i10 = 0;
                                    i11 = 1;
                                }
                            } else {
                                throw ParserException.a((RuntimeException) null, "No valid varint length mask found");
                            }
                        }
                        throw ParserException.a((RuntimeException) null, "EBML lacing sample size out of range.");
                    } else {
                        throw ParserException.a((RuntimeException) null, "Unexpected lacing value: " + i13);
                    }
                }
                byte[] bArr = wpa.a;
                d28.U0 = d28.i((long) ((bArr[1] & 255) | (bArr[0] << 8))) + d28.O0;
                d28.b1 = (b28.d == 2 || (i7 == 163 && (wpa.a[2] & 128) == 128)) ? 1 : 0;
                d28.T0 = 2;
                d28.W0 = 0;
                i3 = 163;
            } else {
                i3 = 163;
            }
            if (i7 == i3) {
                while (true) {
                    int i28 = d28.W0;
                    if (i28 < d28.X0) {
                        d28.c(b28, d28.U0 + ((long) ((d28.W0 * b28.e) / 1000)), d28.b1, d28.j(sa42, b28, d28.Y0[i28], false), 0);
                        d28.W0++;
                    } else {
                        d28.T0 = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = d28.W0;
                    if (i29 < d28.X0) {
                        int[] iArr5 = d28.Y0;
                        iArr5[i29] = d28.j(sa42, b28, iArr5[i29], true);
                        d28.W0++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i7 != 165) {
            if (i7 == 16877) {
                d28.b(i7);
                b28 b282 = d28.H0;
                int i30 = b282.g;
                if (i30 == 1685485123 || i30 == 1685480259) {
                    byte[] bArr2 = new byte[i8];
                    b282.O = bArr2;
                    sa42.h(bArr2, 0, i8, false);
                    return;
                }
                sa42.z(i8);
            } else if (i7 == 16981) {
                d28.b(i7);
                b28 b283 = d28.H0;
                byte[] bArr3 = new byte[i8];
                b283.i = bArr3;
                sa42.h(bArr3, 0, i8, false);
            } else if (i7 == 18402) {
                byte[] bArr4 = new byte[i8];
                sa42.h(bArr4, 0, i8, false);
                d28.b(i7);
                d28.H0.j = new wze(1, 0, 0, bArr4);
            } else if (i7 == 21419) {
                wpa wpa2 = d28.v0;
                Arrays.fill(wpa2.a, (byte) 0);
                sa42.h(wpa2.a, 4 - i8, i8, false);
                wpa2.G(0);
                d28.J0 = (int) wpa2.w();
            } else if (i7 == 25506) {
                d28.b(i7);
                b28 b284 = d28.H0;
                byte[] bArr5 = new byte[i8];
                b284.k = bArr5;
                sa42.h(bArr5, 0, i8, false);
            } else if (i7 == 30322) {
                d28.b(i7);
                b28 b285 = d28.H0;
                byte[] bArr6 = new byte[i8];
                b285.w = bArr6;
                sa42.h(bArr6, 0, i8, false);
            } else {
                throw ParserException.a((RuntimeException) null, "Unexpected id: " + i7);
            }
        } else if (d28.T0 == 2) {
            b28 b286 = (b28) sparseArray.get(d28.Z0);
            if (d28.c1 != 4 || !"V_VP9".equals(b286.b)) {
                sa42.z(i8);
                return;
            }
            wpa wpa3 = d28.A0;
            wpa3.D(i8);
            sa42.h(wpa3.a, 0, i8, false);
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public re6 u() {
        return new re6(8, (Object) wma.a((mi9) this.b));
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, zpa] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, zpa] */
    public void v(go7 go7, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        bqa bqa = (bqa) go7;
        y14 y14 = (y14) this.b;
        y14.getClass();
        long j5 = bqa.a;
        Uri uri = bqa.o.c;
        yn7 yn7 = new yn7(j4);
        y14.m.getClass();
        y14.q.z(yn7, bqa.c, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        i14 i14 = (i14) bqa.Y;
        i14 i142 = y14.H;
        int size = i142 == null ? 0 : i142.m.size();
        long j6 = i14.b(0).b;
        int i = 0;
        while (i < size && y14.H.b(i).b < j6) {
            i++;
        }
        if (i14.d) {
            if (size - i > i14.m.size()) {
                z04.c0("Loaded out of sync manifest");
            } else {
                long j7 = y14.N;
                if (j7 == -9223372036854775807L || i14.h * 1000 > j7) {
                    y14.M = 0;
                } else {
                    z04.c0("Loaded stale dynamic manifest: " + i14.h + ", " + y14.N);
                }
            }
            int i2 = y14.M;
            y14.M = i2 + 1;
            if (i2 < y14.m.p(bqa.c)) {
                y14.D.postDelayed(y14.v, (long) Math.min((y14.M - 1) * 1000, 5000));
                return;
            } else {
                y14.C = new DashManifestStaleException();
                return;
            }
        }
        y14.H = i14;
        y14.I = i14.d & y14.I;
        y14.J = j3 - j4;
        y14.K = j3;
        y14.O += i;
        synchronized (y14.t) {
            try {
                if (bqa.b.a == y14.F) {
                    Uri uri2 = y14.H.k;
                    if (uri2 == null) {
                        uri2 = bqa.o.c;
                    }
                    y14.F = uri2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        i14 i143 = y14.H;
        if (!i143.d || y14.L != -9223372036854775807L) {
            y14.y(true);
            return;
        }
        bdb bdb = i143.i;
        if (bdb != null) {
            String str = (String) bdb.b;
            if (oaf.a(str, "urn:mpeg:dash:utc:direct:2014") || oaf.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    y14.L = oaf.V((String) bdb.c) - y14.K;
                    y14.y(true);
                } catch (ParserException e) {
                    y14.x(e);
                }
            } else if (oaf.a(str, "urn:mpeg:dash:utc:http-iso:2014") || oaf.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                bqa bqa2 = new bqa(y14.z, Uri.parse((String) bdb.c), 5, new Object());
                y14.q.F(new yn7(bqa2.a, bqa2.b, y14.A.v(bqa2, new w4d(11, (Object) y14), 1)), bqa2.c, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
            } else if (oaf.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || oaf.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                bqa bqa3 = new bqa(y14.z, Uri.parse((String) bdb.c), 5, new Object());
                y14.q.F(new yn7(bqa3.a, bqa3.b, y14.A.v(bqa3, new w4d(11, (Object) y14), 1)), bqa3.c, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
            } else if (oaf.a(str, "urn:mpeg:dash:utc:ntp:2014") || oaf.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                y14.v();
            } else {
                y14.x(new IOException("Unsupported UTC timing scheme"));
            }
        } else {
            y14.v();
        }
    }

    public void x(int i, long j) {
        d28 d28 = (d28) this.b;
        d28.getClass();
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        d28.b(i);
                        d28.H0.d = (int) j;
                        return;
                    case 136:
                        d28.b(i);
                        b28 b28 = d28.H0;
                        if (j == 1) {
                            z = true;
                        }
                        b28.W = z;
                        return;
                    case 155:
                        d28.V0 = d28.i(j);
                        return;
                    case 159:
                        d28.b(i);
                        d28.H0.P = (int) j;
                        return;
                    case 176:
                        d28.b(i);
                        d28.H0.m = (int) j;
                        return;
                    case 179:
                        d28.a(i);
                        d28.P0.a(d28.i(j));
                        return;
                    case 186:
                        d28.b(i);
                        d28.H0.n = (int) j;
                        return;
                    case 215:
                        d28.b(i);
                        d28.H0.c = (int) j;
                        return;
                    case 231:
                        d28.O0 = d28.i(j);
                        return;
                    case 238:
                        d28.c1 = (int) j;
                        return;
                    case 241:
                        if (!d28.R0) {
                            d28.a(i);
                            d28.Q0.a(j);
                            d28.R0 = true;
                            return;
                        }
                        return;
                    case 251:
                        d28.d1 = true;
                        return;
                    case 16871:
                        d28.b(i);
                        d28.H0.g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw ParserException.a((RuntimeException) null, "ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw ParserException.a((RuntimeException) null, "DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw ParserException.a((RuntimeException) null, "EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw ParserException.a((RuntimeException) null, "ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw ParserException.a((RuntimeException) null, "AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        d28.K0 = j + d28.D0;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        d28.b(i);
                        if (i2 == 0) {
                            d28.H0.x = 0;
                            return;
                        } else if (i2 == 1) {
                            d28.H0.x = 2;
                            return;
                        } else if (i2 == 3) {
                            d28.H0.x = 1;
                            return;
                        } else if (i2 == 15) {
                            d28.H0.x = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        d28.b(i);
                        d28.H0.p = (int) j;
                        return;
                    case 21682:
                        d28.b(i);
                        d28.H0.r = (int) j;
                        return;
                    case 21690:
                        d28.b(i);
                        d28.H0.q = (int) j;
                        return;
                    case 21930:
                        d28.b(i);
                        b28 b282 = d28.H0;
                        if (j == 1) {
                            z = true;
                        }
                        b282.V = z;
                        return;
                    case 21938:
                        d28.b(i);
                        b28 b283 = d28.H0;
                        b283.y = true;
                        b283.o = (int) j;
                        return;
                    case 21998:
                        d28.b(i);
                        d28.H0.f = (int) j;
                        return;
                    case 22186:
                        d28.b(i);
                        d28.H0.S = j;
                        return;
                    case 22203:
                        d28.b(i);
                        d28.H0.T = j;
                        return;
                    case 25188:
                        d28.b(i);
                        d28.H0.Q = (int) j;
                        return;
                    case 30114:
                        d28.e1 = j;
                        return;
                    case 30321:
                        d28.b(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            d28.H0.s = 0;
                            return;
                        } else if (i3 == 1) {
                            d28.H0.s = 1;
                            return;
                        } else if (i3 == 2) {
                            d28.H0.s = 2;
                            return;
                        } else if (i3 == 3) {
                            d28.H0.s = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        d28.b(i);
                        d28.H0.e = (int) j;
                        return;
                    case 2807729:
                        d28.E0 = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                d28.b(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    d28.H0.B = 2;
                                    return;
                                } else if (i4 == 2) {
                                    d28.H0.B = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                d28.b(i);
                                int i5 = i63.i((int) j);
                                if (i5 != -1) {
                                    d28.H0.A = i5;
                                    return;
                                }
                                return;
                            case 21947:
                                d28.b(i);
                                d28.H0.y = true;
                                int h = i63.h((int) j);
                                if (h != -1) {
                                    d28.H0.z = h;
                                    return;
                                }
                                return;
                            case 21948:
                                d28.b(i);
                                d28.H0.C = (int) j;
                                return;
                            case 21949:
                                d28.b(i);
                                d28.H0.D = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw ParserException.a((RuntimeException) null, "ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw ParserException.a((RuntimeException) null, "ContentEncodingOrder " + j + " not supported");
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, un7] */
    public void y() {
        hm9.p(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontFailed", (Throwable) null);
        ((LoadEmojiFontWorker) this.b).state = new Object();
    }

    public PointF z() {
        return ((xg1) this.b).s0;
    }

    public /* synthetic */ wd6(int i, boolean z) {
        this.a = i;
    }

    public wd6(yxc yxc) {
        this.a = 9;
        this.b = new sy4(9, (Object) yxc);
    }

    public wd6(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new rm5(1);
                return;
            case 2:
                this.b = "com.google.android.gms.org.conscrypt";
                return;
            case 4:
                this.b = new CopyOnWriteArrayList();
                return;
            case 7:
                this.b = mi9.b();
                return;
            case 13:
                this.b = (SmallDisplaySizeQuirk) zi4.a.e(SmallDisplaySizeQuirk.class);
                return;
            case LangUtils.HASH_SEED /*17*/:
                this.b = new wpa(10);
                return;
            case 25:
                this.b = new LinkedHashSet();
                return;
            case 28:
                this.b = new Object();
                return;
            default:
                this.b = new HashSet();
                return;
        }
    }

    public wd6(ByteBuffer byteBuffer) {
        this.a = 22;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public wd6(ContentInfo contentInfo) {
        this.a = 10;
        contentInfo.getClass();
        this.b = m30.m(contentInfo);
    }
}
