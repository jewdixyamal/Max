package defpackage;

import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: ln4  reason: default package */
public final /* synthetic */ class ln4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadFileAttachWorker b;

    public /* synthetic */ ln4(DownloadFileAttachWorker downloadFileAttachWorker, int i) {
        this.a = i;
        this.b = downloadFileAttachWorker;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [one, java.lang.Object] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                d24 inputData = this.b.getInputData();
                ? obj = new Object();
                obj.a = inputData.d("messageId", 0);
                String e = inputData.e("attachId");
                String str = "";
                if (e == null) {
                    e = str;
                }
                obj.b = e;
                obj.c = inputData.d("videoId", 0);
                obj.d = inputData.d("audioId", 0);
                obj.e = inputData.d("mp4GifId", 0);
                obj.f = inputData.d("stickerId", 0);
                String e2 = inputData.e("url");
                if (e2 == null) {
                    e2 = str;
                }
                obj.g = e2;
                obj.h = inputData.b("notifyProgress", false);
                obj.i = inputData.b("checkAutoLoadConnection", false);
                obj.j = inputData.d("fileId", 0);
                String e3 = inputData.e("fileName");
                if (e3 != null) {
                    str = e3;
                }
                obj.k = str;
                Object obj2 = inputData.a.get("invalidateCount");
                obj.l = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                obj.m = inputData.b("useOriginalExtension", false);
                obj.n = inputData.b("notCopyVideoToGallery", false);
                return new pne(obj);
            case 1:
                return ((jyc) this.b.getTamComponent()).f();
            case 2:
                return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
            case 3:
                return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
            case 4:
                return ((jyc) this.b.getTamComponent()).c();
            case 5:
                return ((jyc) this.b.getTamComponent()).i();
            case 6:
                return ((jyc) this.b.getTamComponent()).e();
            case 7:
                return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
            case 8:
                return ((jyc) this.b.getTamComponent()).k();
            case 9:
                return ((jyc) this.b.getTamComponent()).s();
            case 10:
                return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
            case 11:
                return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
            case 13:
                return ((jyc) this.b.getTamComponent()).j();
            default:
                return ((jyc) this.b.getTamComponent()).n();
        }
    }
}
