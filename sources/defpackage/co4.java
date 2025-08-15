package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: co4  reason: default package */
public final /* synthetic */ class co4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadFileFromWebAppWorker b;

    public /* synthetic */ co4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, int i) {
        this.a = i;
        this.b = downloadFileFromWebAppWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                d24 inputData = this.b.getInputData();
                long d = inputData.d("requestId", 0);
                long d2 = inputData.d("botId", 0);
                String e = inputData.e("fileName");
                String str = e == null ? "" : e;
                String e2 = inputData.e("fileUrl");
                return new yne(e2 == null ? "" : e2, str, d, d2);
            case 1:
                DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
            case 2:
                return ((jyc) this.b.getTamComponent()).j();
            case 3:
                return ((jyc) this.b.getTamComponent()).e();
            case 4:
                return (dfe) ((jyc) this.b.getTamComponent()).getAccessor().c(dfe.class);
            case 5:
                return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
            case 6:
                return ((jyc) this.b.getTamComponent()).k();
            case 7:
                return ((jyc) this.b.getTamComponent()).s();
            case 8:
                return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
            default:
                return (ds3) ((jyc) this.b.getTamComponent()).getAccessor().c(ds3.class);
        }
    }
}
