package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.text.Collator;
import java.util.Collections;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.tamtam.nano.Protos;

/* renamed from: un0  reason: default package */
public final /* synthetic */ class un0 implements qj3, w56, ApplicationNameProvider, za7, b66, g8b, df9, c7b, ru0, ol0 {
    public final /* synthetic */ int a;

    public /* synthetic */ un0(int i) {
        this.a = i;
    }

    public static Bitmap c(int i, byte[] bArr) {
        try {
            return c54.q(bArr, i, (BitmapFactory.Options) null);
        } catch (ParserException e) {
            throw new Exception("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new Exception(e2);
        }
    }

    public void a(see see) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(see.b.getWidth(), see.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        see.b(surface, ju0.k(), new vx1(surface, 0, surfaceTexture));
    }

    public void accept(Object obj, Object obj2) {
        Collator collator = (Collator) obj;
        Throwable th = (Throwable) obj2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                return ((la5) obj).m().getClass().getSimpleName();
            case 8:
                dc1 dc1 = (dc1) obj;
                return new es1(new dc1(dc1.c, dc1.a, dc1.b));
            case 10:
                Throwable th = (Throwable) obj;
                return iqd.g(Collections.emptyList());
            default:
                c73 c73 = (c73) obj;
                c73.getClass();
                Bundle bundle = new Bundle();
                y9d y9d = c73.a;
                if (y9d != null) {
                    bundle.putBundle(c73.i, y9d.b());
                }
                int i = c73.b;
                if (i != -1) {
                    bundle.putInt(c73.j, i);
                }
                int i2 = c73.c;
                if (i2 != 0) {
                    bundle.putInt(c73.p, i2);
                }
                int i3 = c73.d;
                if (i3 != 0) {
                    bundle.putInt(c73.k, i3);
                }
                CharSequence charSequence = c73.f;
                if (charSequence != "") {
                    bundle.putCharSequence(c73.l, charSequence);
                }
                Bundle bundle2 = c73.g;
                if (!bundle2.isEmpty()) {
                    bundle.putBundle(c73.m, bundle2);
                }
                Uri uri = c73.e;
                if (uri != null) {
                    bundle.putParcelable(c73.o, uri);
                }
                boolean z = c73.h;
                if (!z) {
                    bundle.putBoolean(c73.n, z);
                }
                return bundle;
        }
    }

    public boolean b(TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 11:
                return u40.f(totalCaptureResult, false);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return u40.f(totalCaptureResult, false);
            default:
                return u40.f(totalCaptureResult, true);
        }
    }

    public su0 g(Bundle bundle) {
        return new h63(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public String getName() {
        return "";
    }

    public Object parse(db7 db7) {
        return CallInfo.parse(db7);
    }

    public Object r(gy8 gy8) {
        int i;
        String str;
        gy8 gy82 = gy8;
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
        long j = 0;
        long j2 = 0;
        String str2 = null;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th3) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th3);
                }
                int s2 = au1.s(k7d.a);
                if (s2 != 0) {
                    if (s2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                try {
                    int hashCode = str.hashCode();
                    if (hashCode != -1900987004) {
                        if (hashCode != 3355) {
                            if (hashCode != 92902992) {
                                if (hashCode == 1133704324) {
                                    if (str.equals("permissions")) {
                                        i2 = lz7.L(gy8);
                                    }
                                }
                            } else if (str.equals("alias")) {
                                str2 = lz7.P(gy8);
                            }
                        } else if (str.equals("id")) {
                            j = lz7.M(gy82, 0);
                        }
                    } else if (str.equals("inviterId")) {
                        j2 = lz7.M(gy82, 0);
                    }
                    gy8.z();
                } catch (Throwable th4) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = u7d.a.iterator();
                    while (it3.hasNext()) {
                        ((r4a) it3.next()).getClass();
                        r4a.a(th4);
                    }
                    int s3 = au1.s(k7d.a);
                    if (s3 != 0) {
                        if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
            }
        }
        return new ca(i2, j, j2, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r1 = r2.l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean test(java.lang.Object r2) {
        /*
            r1 = this;
            int r1 = r1.a
            e52 r2 = (defpackage.e52) r2
            switch(r1) {
                case 16: goto L_0x000c;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r1 = r2.M()
            return r1
        L_0x000c:
            boolean r1 = r2.M()
            r0 = 1
            if (r1 != 0) goto L_0x0014
            goto L_0x0022
        L_0x0014:
            uj3 r1 = r2.l()
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.s()
            if (r1 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un0.test(java.lang.Object):boolean");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                hm9.p("dq0", "Failed to delete all botCommands", (Throwable) obj);
                return;
            case 2:
                hm9.p("dq0", "Failed to store botCommands", (Throwable) obj);
                return;
            case 5:
                hm9.p("cx0", "onViewCreated: failed", (Throwable) obj);
                return;
            case 9:
                hm9.p("fd1", "loadInternal: failed", (Throwable) obj);
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((u82) obj).L = 0;
                return;
            case 18:
                hm9.p("p82", "updateChatLastSearchClickTimeAsync: failed", (Throwable) obj);
                return;
            case 19:
                hm9.p("p82", "error while localRemoveChat", (Throwable) obj);
                return;
            case 20:
                hm9.p("p82", "updateChatWriteTimeAsync: failed", (Throwable) obj);
                return;
            case 21:
                ((u82) obj).m0 = null;
                return;
            case 25:
                ((hl3) obj).j = 2;
                return;
            case 26:
                hm9.p("ContactController", "changeLastSearchClickTimeAsync: failed", (Throwable) obj);
                return;
            case 27:
                hm9.p("ContactController", "changeLastShowingUnknownContactBar: failed", (Throwable) obj);
                return;
            default:
                hm9.p("rr3", "asyncUpdate: exception", (Throwable) obj);
                return;
        }
    }
}
