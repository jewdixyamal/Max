package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: mzf  reason: default package */
public final class mzf extends ffe implements a66 {
    public final /* synthetic */ zzf X;
    public final /* synthetic */ nwf Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mzf(zzf zzf, nwf nwf, long j, Continuation continuation) {
        super(2, continuation);
        this.X = zzf;
        this.Y = nwf;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mzf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mzf(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        zzf zzf = this.X;
        rf5 rf5 = (rf5) zzf.x0.getValue();
        nwf nwf = this.Y;
        String str = nwf.d;
        long j = this.Z;
        long j2 = zzf.b;
        String str2 = nwf.c;
        yne yne = new yne(str2, str, j, j2);
        rf5.getClass();
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "start %s", yne);
        String str3 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker/" + yne;
        qla qla = (qla) ((qla) ((qla) new qla(DownloadFileFromWebAppWorker.class).setExpedited(jna.a)).setBackoffCriteria(mf0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker");
        kpa[] kpaArr = {new kpa("taskName", str3), new kpa("requestId", Long.valueOf(j)), new kpa("botId", Long.valueOf(j2)), new kpa("fileName", str), new kpa("fileUrl", str2)};
        qqd qqd = new qqd(9, (byte) 0);
        for (int i = 0; i < 5; i++) {
            kpa kpa = kpaArr[i];
            qqd.A(kpa.b, (String) kpa.a);
        }
        mh7 b = rf5.a.b(str3, h65.b, (rla) ((qla) qla.setInputData(qqd.p())).build(), false);
        b.l();
        od2.f(od2.g(new uq5(b.m.q(), (Continuation) null)), -1, 2);
        mwf mwf = mwf.DOWNLOADING;
        zt0 zt0 = nwf.a;
        if (!zt0.p()) {
            zt0.n(mwf);
        }
        zzf.R0.put(new Long(this.Z), nwf);
        return e5f.a;
    }
}
