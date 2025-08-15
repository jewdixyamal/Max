package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.LogFactory;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* renamed from: lt1  reason: default package */
public final /* synthetic */ class lt1 implements mq1, c7b, grd, jm7, qj3, u98, rj8, s0a, d38, eqc, bb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lt1(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public void accept(Object obj) {
        long j = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 4:
                hm9.m("dq7", "validateThumbnailUri: id = %d, result = %s, uri = %s", Long.valueOf(j), (Boolean) obj, (String) obj2);
                return;
            default:
                int i = VideoPlayerSeekBarPreview.E0;
                VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = (VideoPlayerSeekBarPreview) obj2;
                videoPlayerSeekBarPreview.getClass();
                Locale locale = Locale.ENGLISH;
                hm9.p("ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview", "Can't extract frame millis = " + j, (Throwable) obj);
                cqc.b(videoPlayerSeekBarPreview.u0);
                videoPlayerSeekBarPreview.c.a(false);
                return;
        }
    }

    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        hc0 hc0 = (hc0) this.c;
        String str = hc0.a;
        z8b z8b = hc0.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(d9b.a(z8b))}) < 1) {
            contentValues.put("backend_name", hc0.a);
            contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(d9b.a(z8b)));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    public void b(ra3 ra3) {
        a9f a9f = (a9f) this.c;
        long j = this.b;
        a9f.getClass();
        hm9.m("a9f", "removeUploadWithAttachId: attachId=" + j, new Object[0]);
        synchronized (a9f) {
            a9f.a.b(j).e(((y8f) a9f.b.getValue()).b(j)).a();
        }
        if (!ra3.h()) {
            ra3.b();
        }
    }

    public void c(qr6 qr6, int i) {
        qr6.X(((w98) this.c).c, i, this.b);
    }

    public void d(j28 j28) {
        uy uyVar;
        rfc rfc = (rfc) this.c;
        fef fef = rfc.e;
        if (fef != null && (uyVar = ((ok0) fef).f) != null) {
            xv6 d = xv6.d(Uri.parse((String) uyVar.Y));
            d.l = new w26(rfc.e, this.b);
            g0 a2 = rfc.f.a(d.a(), (Object) null);
            rfc.h = a2;
            a2.m(new qfc(j28), qq1.a);
        } else if (!j28.h()) {
            j28.onError(new IllegalStateException("Video content or collage is null"));
        }
    }

    public void e(ez9 ez9) {
        Bitmap bitmap;
        int i = 0;
        while (true) {
            RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) this.c;
            if (((float) i) >= rangeSeekBarView.M0 + 2.0f || ez9.h()) {
                ez9.b();
            } else {
                long j = (((long) i) * rangeSeekBarView.N0) + this.b;
                if (rangeSeekBarView.G0.get(j) == null) {
                    FrgTrimVideo frgTrimVideo = rangeSeekBarView.I0;
                    int i2 = rangeSeekBarView.L0;
                    if (frgTrimVideo.B1 == null) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        frgTrimVideo.B1 = mediaMetadataRetriever;
                        mediaMetadataRetriever.setDataSource(frgTrimVideo.d0(), frgTrimVideo.D1);
                    }
                    Bitmap frameAtTime = frgTrimVideo.B1.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(j), 2);
                    if (frameAtTime == null) {
                        bitmap = null;
                    } else {
                        int min = Math.min(frameAtTime.getWidth(), frameAtTime.getHeight());
                        int width = (frameAtTime.getWidth() - min) / 2;
                        int height = (frameAtTime.getHeight() - min) / 2;
                        Rect rect = new Rect(width, height, width + min, min + height);
                        bitmap = Bitmap.createScaledBitmap(Bitmap.createBitmap(frameAtTime, rect.left, rect.top, rect.width(), rect.height()), i2, i2, true);
                    }
                    if (bitmap != null) {
                        ez9.d(new mpa(Long.valueOf(j), bitmap));
                    }
                }
                i++;
            }
        }
        ez9.b();
    }

    public void invoke(Object obj) {
        ve8 ve8;
        u65 u65 = (u65) obj;
        u65.getClass();
        u65.u();
        Object obj2 = this.c;
        hm9.m("u65", "videoDebugListener.onRenderedFirstFrame: output = %s renderTimeMs = %d", obj2 != null ? obj2.toString() : "", Long.valueOf(this.b));
        bq7 bq7 = u65.Y;
        if (bq7 != null && (ve8 = bq7.e) != null) {
            ve8.i0();
        }
    }

    public void j(nqd nqd) {
        zf2 zf2 = (zf2) this.c;
        cu8 q = zf2.r.q(this.b);
        if (q != null) {
            zf2.t.e(q);
            zu8 zu8 = zf2.u;
            zu8.getClass();
            nqd.a(zu8.a(zu8, q));
        }
    }

    public Object k(ii8 ii8, oh8 oh8, int i) {
        return ii8.q(oh8, zw6.n((tb8) this.c), 0, this.b);
    }

    public String q(lq1 lq1) {
        st1 st1 = (st1) this.c;
        st1.getClass();
        long j = this.b;
        st1.p(new mt1(j, lq1));
        return "waitForSessionUpdateId:" + j;
    }

    public boolean test(Object obj) {
        e52 e52 = (e52) obj;
        if (e52.b.f(this.b)) {
            if (e52.b.k <= 0) {
                return false;
            }
        } else if (!p82.N.test(e52)) {
            return false;
        } else {
            c7b c7b = (c7b) this.c;
            if (c7b != null && !c7b.test(e52)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ lt1(ed edVar, Object obj, long j) {
        this.a = 3;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ lt1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
