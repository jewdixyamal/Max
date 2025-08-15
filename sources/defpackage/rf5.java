package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: rf5  reason: default package */
public final class rf5 {
    public final v7g a;

    public rf5(v7g v7g) {
        this.a = v7g;
    }

    public final t03 a(pne pne) {
        pne pne2 = pne;
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "start %s", pne);
        StringBuilder sb = new StringBuilder("TaskAttachDownloadData{messageId=");
        long j = pne2.a;
        sb.append(j);
        sb.append(", attachId='");
        String str = pne2.b;
        sb.append(str);
        sb.append("', videoId=");
        long j2 = pne2.c;
        sb.append(j2);
        sb.append(", audioId=");
        long j3 = pne2.d;
        sb.append(j3);
        sb.append(", mp4GifId=");
        long j4 = pne2.e;
        sb.append(j4);
        sb.append(", stickerId=");
        long j5 = pne2.f;
        sb.append(j5);
        sb.append(", fileId=");
        long j6 = j5;
        long j7 = pne2.j;
        sb.append(j7);
        sb.append(", fileName='");
        String str2 = pne2.k;
        long j8 = j7;
        String i = wg0.i("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker/", zr6.l(sb, str2, "'}"));
        String str3 = str2;
        kpa kpa = new kpa("taskName", i);
        kpa kpa2 = new kpa("messageId", Long.valueOf(j));
        kpa kpa3 = new kpa("attachId", str);
        kpa kpa4 = new kpa("videoId", Long.valueOf(j2));
        kpa kpa5 = new kpa("audioId", Long.valueOf(j3));
        kpa kpa6 = new kpa("mp4GifId", Long.valueOf(j4));
        kpa kpa7 = new kpa("stickerId", Long.valueOf(j6));
        pne pne3 = pne;
        kpa kpa8 = new kpa("url", pne3.g);
        kpa kpa9 = new kpa("notifyProgress", Boolean.valueOf(pne3.h));
        kpa kpa10 = new kpa("checkAutoLoadConnection", Boolean.valueOf(pne3.i));
        kpa kpa11 = new kpa("fileId", Long.valueOf(j8));
        String str4 = i;
        kpa kpa12 = new kpa("fileName", str3);
        qla qla = (qla) ((qla) ((qla) new qla(DownloadFileAttachWorker.class).setExpedited(jna.a)).setBackoffCriteria(mf0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker");
        kpa[] kpaArr = {kpa, kpa2, kpa3, kpa4, kpa5, kpa6, kpa7, kpa8, kpa9, kpa10, kpa11, kpa12, new kpa("invalidateCount", Integer.valueOf(pne3.l)), new kpa("useOriginalExtension", Boolean.valueOf(pne3.m)), new kpa("notCopyVideoToGallery", Boolean.valueOf(pne3.n))};
        qqd qqd = new qqd(9, (byte) 0);
        for (int i2 = 0; i2 < 15; i2++) {
            kpa kpa13 = kpaArr[i2];
            qqd.A(kpa13.b, (String) kpa13.a);
        }
        d24 p = qqd.p();
        h65 h65 = h65.b;
        mh7 b = this.a.b(str4, h65, (rla) ((qla) qla.setInputData(p)).build(), false);
        b.l();
        return new t03(od2.f(od2.g(new uq5(b.m.q(), (Continuation) null)), -1, 2), 5);
    }
}
