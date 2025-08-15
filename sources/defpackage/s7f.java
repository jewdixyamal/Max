package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: s7f  reason: default package */
public final class s7f implements fq6 {
    public final /* synthetic */ UploadExternalGifWorker a;

    public s7f(UploadExternalGifWorker uploadExternalGifWorker) {
        this.a = uploadExternalGifWorker;
    }

    public final void a() {
        hm9.p("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadFailed", (Throwable) null);
        this.a.z0 = hx9.u0;
    }

    public final void b() {
        hm9.p("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onUrlExpired", (Throwable) null);
        ((cba) ((o45) this.a.w0.getValue())).c(new Exception("Tenor gif url expired"), true);
        this.a.z0 = huc.u0;
    }

    public final void d() {
        hm9.m("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCancelled", new Object[0]);
        this.a.z0 = rq9.u0;
    }

    public final void e(File file) {
        hm9.m("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted", new Object[0]);
        ((eoe) this.a.s0.getValue()).d(this.a.d().a);
        UploadExternalGifWorker.c(this.a);
        cu8 q = ((au8) this.a.o.getValue()).q(this.a.d().d);
        if (q == null || q.v0 == vx8.DELETED) {
            hm9.m("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted: Message was deleted", new Object[0]);
            this.a.z0 = o7f.a;
            return;
        }
        File l = ((kk5) ((zi5) this.a.c.getValue())).l(this.a.d().f);
        if (!pag.k(l)) {
            ((cj0) ((af8) this.a.t0.getValue())).b(file, l);
        }
        this.a.z0 = new n7f(new y95(file.getAbsolutePath(), 0, 0, (String) null, (String) null, (String) null));
    }

    public final void f() {
        hm9.p("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadInterrupted: Can't download video", (Throwable) null);
        ((eoe) this.a.s0.getValue()).n(this.a.d().a, goe.WAITING);
        this.a.z0 = buc.u0;
    }

    public final String getDownloadContext() {
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        long j = uploadExternalGifWorker.d().d;
        String str = uploadExternalGifWorker.d().c;
        return j + "_" + str;
    }

    public final void j(float f, long j) {
        hm9.m("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress progress = %s " + f, new Object[0]);
        long nanoTime = System.nanoTime();
        if ((f > 0.0f || f < 100.0f) && Math.abs(nanoTime - this.a.y0) < 500000000) {
            hm9.m("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "Skip progress", new Object[0]);
            return;
        }
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        uploadExternalGifWorker.y0 = nanoTime;
        cu8 q = ((au8) uploadExternalGifWorker.o.getValue()).q(this.a.d().d);
        if (q == null || q.v0 == vx8.DELETED) {
            hm9.m("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress: Message was deleted", new Object[0]);
            ((gq6) this.a.Y.getValue()).a(((kk5) ((zi5) this.a.c.getValue())).n(this.a.d().f), this.a.d().f);
            ((eoe) this.a.s0.getValue()).d(this.a.d().a);
            UploadExternalGifWorker.c(this.a);
            return;
        }
        this.a.z0 = new p7f(f, q.o);
    }
}
