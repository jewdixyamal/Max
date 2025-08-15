package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.browse.MediaBrowser;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.util.Size;
import android.view.GestureDetector;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.recyclerview.widget.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import org.apache.http.util.LangUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: fd7  reason: default package */
public final class fd7 implements lv, ri0, a76, ckf, oy1, lo7, pr7, JavaAudioDeviceModule.AudioRecordSampleHook, xha, hmf, a24 {
    public Object a;

    public /* synthetic */ fd7(Object obj) {
        this.a = obj;
    }

    public static fd7 H(wpa wpa) {
        String str;
        wpa.H(2);
        int u = wpa.u();
        int i = u >> 1;
        int u2 = ((wpa.u() >> 3) & 31) | ((u & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (u2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u2);
        return new fd7(sb.toString());
    }

    public static eb0 K(qa0 qa0) {
        eb0 eb0 = qa0.a;
        ov6 ov6 = (ov6) eb0.a;
        Rect rect = eb0.e;
        try {
            byte[] h0 = f46.h0(ov6, rect, qa0.b, eb0.f);
            try {
                p55 p55 = new p55(new c65((InputStream) new ByteArrayInputStream(h0)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                RectF rectF = e1f.a;
                Matrix matrix = new Matrix(eb0.g);
                matrix.postTranslate((float) (-rect.left), (float) (-rect.top));
                return new eb0(h0, p55, 256, size, rect2, eb0.f, matrix, eb0.h);
            } catch (IOException e) {
                throw new Exception("Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil$CodecFailedException e2) {
            throw new Exception("Failed to encode the image to JPEG.", e2);
        }
    }

    public boolean A() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r17 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086 A[EDGE_INSN: B:46:0x0086->B:35:0x0086 ?: BREAK  
    EDGE_INSN: B:48:0x0086->B:35:0x0086 ?: BREAK  
    EDGE_INSN: B:49:0x0086->B:35:0x0086 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:1:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.StaticLayout B(java.lang.CharSequence r19, android.text.TextPaint r20, int r21, android.text.Layout.Alignment r22, boolean r23, android.text.TextUtils.TruncateAt r24, int r25) {
        /*
            r18 = this;
            r1 = r19
            r0 = r18
            java.lang.Object r0 = r0.a
            r2 = r0
            o45 r2 = (defpackage.o45) r2
            java.lang.String r3 = "fd7"
            r4 = 0
            r15 = r1
            r16 = r4
        L_0x000f:
            int r0 = r15.length()     // Catch:{ IndexOutOfBoundsException -> 0x0046, IllegalArgumentException -> 0x001f }
            if (r16 == 0) goto L_0x0018
            r6 = r0
            r7 = r4
            goto L_0x001a
        L_0x0018:
            r7 = r0
            r6 = r4
        L_0x001a:
            if (r16 == 0) goto L_0x0027
            zoe r0 = defpackage.bpe.e     // Catch:{ IndexOutOfBoundsException -> 0x0023, IllegalArgumentException -> 0x001f }
            goto L_0x0029
        L_0x001f:
            r0 = move-exception
            r17 = r15
            goto L_0x004a
        L_0x0023:
            r0 = move-exception
            r5 = r15
            goto L_0x009a
        L_0x0027:
            zoe r0 = defpackage.bpe.c     // Catch:{ IndexOutOfBoundsException -> 0x0046, IllegalArgumentException -> 0x001f }
        L_0x0029:
            r5 = r15
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r21
            r14 = r25
            r17 = r15
            r15 = r0
            android.text.StaticLayout r0 = defpackage.oag.w(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0042, IllegalArgumentException -> 0x0040 }
            return r0
        L_0x0040:
            r0 = move-exception
            goto L_0x004a
        L_0x0042:
            r0 = move-exception
        L_0x0043:
            r5 = r17
            goto L_0x009a
        L_0x0046:
            r0 = move-exception
            r17 = r15
            goto L_0x0043
        L_0x004a:
            java.lang.String r5 = "seems we work with RTL text"
            defpackage.hm9.p(r3, r5, r0)
            java.lang.String r5 = r0.getMessage()
            if (r5 != 0) goto L_0x0057
            java.lang.String r5 = ""
        L_0x0057:
            if (r16 != 0) goto L_0x0086
            java.lang.String r6 = "fromIndex"
            boolean r6 = defpackage.w9e.p0(r5, r6, r4)
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = "toIndex"
            boolean r5 = defpackage.w9e.p0(r5, r6, r4)
            if (r5 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0081
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r5 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "check range exception: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r0)
            ((defpackage.cba) r2).c(r5, false)
        L_0x0081:
            r16 = 1
            r15 = r17
            goto L_0x000f
        L_0x0086:
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r2 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "unknown: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x009a:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 != 0) goto L_0x00bf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Hit bug #35412, retrying with Spannables removed: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            defpackage.hm9.p(r3, r6, r0)
            if (r2 == 0) goto L_0x00b9
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r7 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            r7.<init>(r6, r0)
            ((defpackage.cba) r2).c(r7, false)
        L_0x00b9:
            java.lang.String r15 = r5.toString()
            goto L_0x000f
        L_0x00bf:
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r2 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "strange: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd7.B(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, boolean, android.text.TextUtils$TruncateAt, int):android.text.StaticLayout");
    }

    public long C() {
        return 0;
    }

    public long D(long j) {
        return 1;
    }

    public long E(long j, long j2) {
        return 1;
    }

    public o43 F(int i) {
        return ((wn0) ((te) this.a).b).f(i);
    }

    public void G(String str) {
        hm9.k(((e3) this.a).e, str);
    }

    public void I(yha yha) {
        ((ulb) ((amb) this.a)).b.invoke(yha);
    }

    public eb0 J(qa0 qa0, int i) {
        byte[] bArr;
        byte b;
        eb0 eb0 = qa0.a;
        ov6 ov6 = (ov6) eb0.a;
        int i2 = 0;
        if (((IncorrectJpegMetadataQuirk) ((qqd) this.a).b) == null) {
            ByteBuffer t = ov6.v()[0].t();
            bArr = new byte[t.capacity()];
            t.rewind();
            t.get(bArr);
        } else {
            ByteBuffer t2 = ov6.v()[0].t();
            int capacity = t2.capacity();
            byte[] bArr2 = new byte[capacity];
            t2.rewind();
            t2.get(bArr2);
            int i3 = 2;
            int i4 = 2;
            while (true) {
                if (i4 + 4 <= capacity && (b = bArr2[i4]) == -1) {
                    if (b == -1 && bArr2[i4 + 1] == -38) {
                        break;
                    }
                    i4 += (((bArr2[i4 + 2] & 255) << 8) | (bArr2[i4 + 3] & 255)) + 2;
                }
            }
            while (true) {
                int i5 = i3 + 1;
                if (i5 <= capacity) {
                    if (bArr2[i3] == -1 && bArr2[i5] == -40) {
                        i2 = i3;
                        break;
                    }
                    i3 = i5;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                bArr = bArr2;
            }
            bArr = Arrays.copyOfRange(bArr2, i2, t2.limit());
        }
        byte[] bArr3 = bArr;
        p55 p55 = eb0.b;
        Objects.requireNonNull(p55);
        return new eb0(bArr3, p55, i, eb0.d, eb0.e, eb0.f, eb0.g, eb0.h);
    }

    public void L(Object obj) {
        boolean z = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.a;
        if (z) {
            List<Parcel> list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
        } else if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            result.sendResult((Object) null);
        }
    }

    public oq1 M(Object obj) {
        kq0.e();
        return f8.g(new y98((Object) this, 19, obj));
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public long b(long j) {
        return 0;
    }

    public void c() {
        y14 y14 = (y14) this.a;
        y14.A.c();
        DashManifestStaleException dashManifestStaleException = y14.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    public void d(Throwable th) {
        synchronized (((sz1) this.a).a) {
            try {
                ((sz1) this.a).d.p();
                int s = au1.s(((sz1) this.a).i);
                if (s == 3 || s == 5 || s == 6) {
                    if (!(th instanceof CancellationException)) {
                        sz1 sz1 = (sz1) this.a;
                        int i = sz1.i;
                        sz1.d();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        if (ChatMediaViewerScreen.v0(chatMediaViewerScreen)) {
            chatMediaViewerScreen.E0(true);
            yk8 yk8 = chatMediaViewerScreen.A0;
            if (yk8 != null) {
                yk8.b(5);
            }
        }
    }

    public void f() {
        try {
            ((qj3) this.a).accept(Boolean.TRUE);
        } catch (Throwable th) {
            hm9.p("nr7", "checkLocationSettingsAndPermissions", th);
        }
    }

    public void g(Exception exc) {
        try {
            ((qj3) this.a).accept(Boolean.FALSE);
        } catch (Throwable th) {
            hm9.p("nr7", "checkLocationSettingsAndPermissions", th);
        }
    }

    public void h() {
        yk8 yk8;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (ChatMediaViewerScreen.v0(chatMediaViewerScreen) && (yk8 = chatMediaViewerScreen.A0) != null) {
            yk8.b(2);
        }
    }

    public e5f h0(long j, List list) {
        ((ua3) ((ta3) this.a)).makeCompleting$kotlinx_coroutines_core(list);
        return e5f.a;
    }

    public void i() {
        yk8 yk8;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        if (chatMediaViewerScreen.B0().b() && ChatMediaViewerScreen.v0(chatMediaViewerScreen) && (yk8 = chatMediaViewerScreen.A0) != null) {
            yk8.b(3);
        }
    }

    public long j(long j, long j2) {
        return j2;
    }

    public long k(long j, long j2) {
        return 0;
    }

    public int l(View view) {
        ((a) this.a).getClass();
        return a.B(view) - ((pdc) view.getLayoutParams()).leftMargin;
    }

    public long m(long j, long j2) {
        return -9223372036854775807L;
    }

    public r4c n(long j) {
        return (r4c) this.a;
    }

    public void o() {
        yk8 yk8;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (ChatMediaViewerScreen.v0(chatMediaViewerScreen) && (yk8 = chatMediaViewerScreen.A0) != null) {
            yk8.b(2);
        }
    }

    public void onWebRtcAudioRecordSamplesReady(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        uoa uoa;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 2) {
            uoa = new soa(i5 >> 1, i4, 0, bArr);
        } else if (i == 3) {
            uoa = new soa(i5, i4, 1, bArr);
        } else if (i == 4) {
            uoa = new toa(bArr, i4, i5);
        } else {
            throw new IllegalArgumentException(wg0.g(i, "Audio format ", " is not supported. Please, use PCM 8 bit / 16 bit / float"));
        }
        Iterator it = ((CopyOnWriteArraySet) this.a).iterator();
        while (it.hasNext()) {
            tag tag = (tag) it.next();
            if (tag.c < elapsedRealtime) {
                tag.c = tag.b + elapsedRealtime;
                tag.a.onSample(i, i2, i3, uoa);
            }
        }
    }

    public int p() {
        return ((a) this.a).J();
    }

    public void q(Typeface typeface) {
        s53 s53 = (s53) this.a;
        if (s53.m(typeface)) {
            s53.i(false);
        }
    }

    public int r() {
        a aVar = (a) this.a;
        return aVar.n - aVar.K();
    }

    public void s(ph3 ph3) {
        boolean z = ph3.b == 0;
        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) this.a;
        if (z) {
            aVar.k((dr6) null, aVar.H0);
            return;
        }
        gpf gpf = aVar.z0;
        if (gpf != null) {
            ((he6) gpf.a).k(ph3);
        }
    }

    public View t(int i) {
        return ((a) this.a).v(i);
    }

    public long v(long j, long j2) {
        return 0;
    }

    public int w(View view) {
        ((a) this.a).getClass();
        return a.E(view) + ((pdc) view.getLayoutParams()).rightMargin;
    }

    public void x() {
        yk8 yk8;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        View view = chatMediaViewerScreen.getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (ChatMediaViewerScreen.v0(chatMediaViewerScreen) && (yk8 = chatMediaViewerScreen.A0) != null) {
            yk8.b(2);
        }
    }

    public void y(boolean z) {
        yk8 yk8;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        if (ChatMediaViewerScreen.v0(chatMediaViewerScreen) && (yk8 = chatMediaViewerScreen.A0) != null) {
            yk8.b(z ? 3 : 2);
        }
    }

    public void y0() {
        yk8 yk8;
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.a;
        if (ChatMediaViewerScreen.v0(chatMediaViewerScreen) && (yk8 = chatMediaViewerScreen.A0) != null) {
            yk8.b(4);
        }
    }

    public Object z(Object obj) {
        eb0 K;
        qa0 qa0 = (qa0) obj;
        eb0 eb0 = qa0.a;
        try {
            int i = eb0.c;
            Object obj2 = eb0.a;
            if (i == 35) {
                K = K(qa0);
            } else if (i == 256 || i == 4101) {
                K = J(qa0, i);
            } else {
                throw new IllegalArgumentException("Unexpected format: " + i);
            }
            ((ov6) obj2).close();
            return K;
        } catch (Throwable th) {
            ((ov6) eb0.a).close();
            throw th;
        }
    }

    public fd7(bj6 bj6, int i) {
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                this.a = new qqd(bj6);
                return;
            default:
                this.a = (CaptureSessionOnClosedNotCalledQuirk) bj6.e(CaptureSessionOnClosedNotCalledQuirk.class);
                return;
        }
    }

    public fd7(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, (Handler) null);
    }
}
