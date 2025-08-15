package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.fragment.app.b;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.crop.FrgTamCropImage;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.messages.settings.FrgMediaSettings;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: z16  reason: default package */
public final /* synthetic */ class z16 implements w56, fnb, y2a, qj3, fu3, d7b, grd, mq1, s0a, b7b, cw7, m88, n88, fa8, lde, rj8, pj3, pj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z16(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public x6g P(View view, x6g x6g) {
        int i;
        FrgLocalVideo frgLocalVideo = (FrgLocalVideo) this.b;
        b b0 = frgLocalVideo.b0();
        if (b0 == null) {
            i = 0;
        } else {
            int a2 = fk4.a(b0);
            if (b0 instanceof ActLocalMedias) {
                ActLocalMedias actLocalMedias = (ActLocalMedias) b0;
                dl9 dl9 = actLocalMedias.j1;
                if (dl9 != null) {
                    i = actLocalMedias.f1.getContentHeight() + ((View) dl9.c).getHeight();
                } else {
                    i = actLocalMedias.f1.getContentHeight();
                }
            } else {
                i = a2;
            }
        }
        Rect rect = new Rect(x6g.b(), x6g.d(), x6g.c(), i);
        wk9 wk9 = frgLocalVideo.J1;
        if (wk9 != null) {
            wk9.A(rect);
        }
        return x6g;
    }

    public int a(Object obj) {
        switch (this.a) {
            case 19:
                try {
                    return ((x78) obj).c((oy5) this.b) ? 1 : 0;
                } catch (MediaCodecUtil$DecoderQueryException unused) {
                    return -1;
                }
            default:
                y78 y78 = (y78) obj;
                y78.getClass();
                qy5 qy5 = (qy5) this.b;
                String str = qy5.n;
                String str2 = y78.b;
                return (!(str2.equals(str) || str2.equals(p88.b(qy5))) || !y78.c(qy5, false)) ? 0 : 1;
        }
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [hc3, java.lang.Object] */
    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 4:
                zl4 zl4 = (zl4) obj;
                FrgMediaSettings frgMediaSettings = (FrgMediaSettings) obj2;
                if (frgMediaSettings.y1 == null) {
                    frgMediaSettings.y1 = new Object();
                }
                frgMediaSettings.y1.a(zl4);
                return;
            case 5:
                Throwable th = (Throwable) obj;
                FrgTamCropImage frgTamCropImage = (FrgTamCropImage) obj2;
                q5 g1 = frgTamCropImage.g1();
                if (g1 != null) {
                    g1.setResult(0);
                    int i = jpc.E;
                    Handler handler = a14.i;
                    a14.N(0, g1, g1.getString(i));
                    frgTamCropImage.e1();
                    return;
                }
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((ml0) obj2).e((List) obj);
                return;
            case 13:
                hm9.r("dq7", (Throwable) obj, "loadThumbnail: %d, thumbnailUri validate error", Long.valueOf(((dq7) obj2).X.b));
                return;
            case 25:
                ((x4b) obj).m((Surface) obj2);
                return;
            default:
                ((ts8) obj2).M(((Integer) obj).intValue());
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                jze jze = (jze) obj;
                ((e26) this.b).getClass();
                return jze;
            default:
                kze kze = (kze) obj;
                ((f26) this.b).getClass();
                return kze;
        }
    }

    public void b() {
        die die = ((FrgAttachPhoto) this.b).M1;
        if (die != null) {
            cqc.b((sd7) die.o);
            for (lz a2 : (List) die.b) {
                a2.a();
            }
        }
    }

    public void c(w98 w98) {
        switch (this.a) {
            case 21:
                qr6 qr6 = w98.w;
                a98 a98 = w98.a;
                if (qr6 != null) {
                    z04.u("Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    a98.release();
                    return;
                }
                uh3 uh3 = (uh3) this.b;
                w98.w = uh3.c;
                w98.q = uh3.e;
                k3b k3b = uh3.f;
                w98.r = k3b;
                k3b k3b2 = uh3.g;
                w98.s = k3b2;
                k3b i = w98.i(k3b, k3b2);
                w98.t = i;
                zw6 zw6 = uh3.k;
                w98.o = zw6;
                w98.p = c73.a(zw6, w98.q, i);
                w98.n = uh3.j;
                try {
                    uh3.c.asBinder().linkToDeath(w98.g, 0);
                    obd obd = w98.e;
                    w98.k = new obd(obd.a.a(), uh3.a, uh3.b, obd.a.getPackageName(), uh3.c, uh3.h);
                    a98.j();
                    return;
                } catch (RemoteException unused) {
                    a98.release();
                    return;
                }
            default:
                if (w98.isConnected() && w98.j.isEmpty()) {
                    qad qad = w98.n.c;
                    long j = qad.c;
                    qad qad2 = (qad) this.b;
                    if (j < qad2.c && j47.f(qad2, qad)) {
                        w98.n = w98.n.j(qad2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void d() {
        iw7 iw7 = (iw7) this.b;
        ((OneMeDraweeView) iw7.a.b).setVisibility(8);
        if (iw7.c) {
            iw7.o = true;
        }
    }

    public void e(ez9 ez9) {
        lp7 lp7 = (lp7) this.b;
        fef fef = lp7.e;
        if (fef != null) {
            lp7.h.setDataSource(fef.l().getPath());
            try {
                lp7.j = Long.parseLong(lp7.h.extractMetadata(9));
            } catch (Exception e) {
                hm9.p("lp7", "Can'e extract duration", e);
                lp7.j = ((ok0) lp7.e).a;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < lp7.i && !ez9.h(); i++) {
                Bitmap scaledFrameAtTime = lp7.h.getScaledFrameAtTime((lp7.j / ((long) lp7.i)) * ((long) i) * 1000, 2, lp7.c, lp7.d);
                if (!ez9.h()) {
                    arrayList.add(scaledFrameAtTime);
                    ez9.d(arrayList);
                }
            }
        } else if (!ez9.h()) {
            IllegalStateException illegalStateException = new IllegalStateException("Video content can't be null");
            if (!ez9.e(illegalStateException)) {
                j47.Z(illegalStateException);
            }
        }
    }

    public void f(x4b x4b, oh8 oh8) {
        ((pj3) this.b).accept(x4b);
    }

    public boolean g(ey1 ey1, int i, Bundle bundle) {
        sy4 sy4;
        Object obj = this.b;
        switch (this.a) {
            case 8:
                if ((i & 1) != 0) {
                    try {
                        ((wmc) ey1.b).r();
                        InputContentInfo inputContentInfo = (InputContentInfo) ((wmc) ey1.b).a;
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                    } catch (Exception unused) {
                        return false;
                    }
                }
                ClipDescription description = ((InputContentInfo) ((wmc) ey1.b).a).getDescription();
                wmc wmc = (wmc) ey1.b;
                ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) wmc.a).getContentUri()));
                if (Build.VERSION.SDK_INT >= 31) {
                    sy4 = new sy4(clipData, 2);
                } else {
                    zs3 zs3 = new zs3();
                    zs3.b = clipData;
                    zs3.c = 2;
                    sy4 = zs3;
                }
                sy4.b(((InputContentInfo) wmc.a).getLinkUri());
                sy4.setExtras(bundle);
                return zmf.g((View) obj, sy4.build()) == null;
            default:
                int i2 = MessageComposeEditText.w0;
                ((MessageComposeEditText) obj).getClass();
                return false;
        }
    }

    public Object get() {
        ye8 ye8 = (ye8) this.b;
        ye8.getClass();
        return ye8.n(ze8.o, new x50(true, false, true));
    }

    public void j(nqd nqd) {
        a37 a37 = (a37) this.b;
        a37.getClass();
        ArrayList arrayList = new ArrayList();
        df5 c = a37.c("https://www.instagram.com/p/%s/", nqd);
        if (c == null) {
            c = a37.c("https://www.instagram.com/p/%s/embed/", nqd);
        }
        if (c != null) {
            arrayList.add(c);
        }
        if (nqd.h()) {
            return;
        }
        if (arrayList.isEmpty()) {
            nqd.onError(new FetcherException(4, "Failed to fetch instagram video"));
        } else {
            nqd.a(new ff5("Instagram", arrayList));
        }
    }

    public Object k(ii8 ii8, oh8 oh8, int i) {
        Object obj = this.b;
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return ii8.k(oh8, (ffc) ((zw6) obj));
            default:
                ew6 ew6 = ew6.b;
                if (!ii8.i()) {
                    ((pj8) obj).f(ii8.s, oh8);
                    sj8.M0(oh8, i, new sad(0));
                }
                return ew6.b;
        }
    }

    public String q(lq1 lq1) {
        va8 va8 = (va8) this.b;
        va8.getClass();
        ju0.D().execute(new vs5(va8, 12, lq1));
        return va8 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public boolean test(Object obj) {
        return ((Locale) obj).getLanguage().equals(((Locale) this.b).getLanguage());
    }

    public Object u(Task task) {
        Object obj;
        ((bwf) this.b).getClass();
        Class<IOException> cls = IOException.class;
        ukg ukg = (ukg) task;
        synchronized (ukg.a) {
            fp3.p("Task is not yet complete", ukg.c);
            if (ukg.d) {
                throw new CancellationException("Task is already canceled.");
            } else if (!cls.isInstance(ukg.f)) {
                Exception exc = ukg.f;
                if (exc == null) {
                    obj = ukg.e;
                } else {
                    throw new RuntimeException(exc);
                }
            } else {
                throw cls.cast(ukg.f);
            }
        }
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: apply  reason: collision with other method in class */
    public boolean m56apply(Object obj) {
        return ((ww0) obj).a((Uri) this.b);
    }
}
