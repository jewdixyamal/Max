package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: k7f  reason: default package */
public final /* synthetic */ class k7f implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadExternalGifWorker b;

    public /* synthetic */ k7f(UploadExternalGifWorker uploadExternalGifWorker, int i) {
        this.a = i;
        this.b = uploadExternalGifWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                d24 inputData = this.b.getInputData();
                long d = inputData.d("requestId", 0);
                String e = inputData.e("externalUrl");
                String str = e == null ? "" : e;
                String e2 = inputData.e("attachLocalId");
                String str2 = e2 == null ? "" : e2;
                long d2 = inputData.d("messageId", 0);
                long d3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0);
                String e3 = inputData.e("stickerId");
                return new m7f(d, d2, str, d3, str2, e3 == null ? "" : e3);
            case 1:
                return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
            case 2:
                return (af8) ((jyc) this.b.getTamComponent()).getAccessor().c(af8.class);
            case 3:
                return (mh5) ((jyc) this.b.getTamComponent()).getAccessor().c(mh5.class);
            case 4:
                return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
            case 5:
                return ((jyc) this.b.getTamComponent()).i();
            case 6:
                return ((jyc) this.b.getTamComponent()).k();
            case 7:
                return Integer.valueOf(this.b.d().hashCode());
            case 8:
                return ((jyc) this.b.getTamComponent()).j();
            case 9:
                return ((jyc) this.b.getTamComponent()).n();
            case 10:
                return ((jyc) this.b.getTamComponent()).f();
            case 11:
                return (gq6) ((jyc) this.b.getTamComponent()).getAccessor().c(gq6.class);
            default:
                return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
        }
    }
}
