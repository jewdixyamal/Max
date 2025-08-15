package defpackage;

import java.util.Collections;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: t7f  reason: default package */
public final /* synthetic */ class t7f implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadFileAttachWorker b;

    public /* synthetic */ t7f(UploadFileAttachWorker uploadFileAttachWorker, int i) {
        this.a = i;
        this.b = uploadFileAttachWorker;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [hy8, java.lang.Object] */
    public final Object invoke() {
        ref ref;
        switch (this.a) {
            case 0:
                d24 inputData = this.b.getInputData();
                ? obj = new Object();
                String e = inputData.e(ClientCookie.PATH_ATTR);
                String str = "";
                if (e == null) {
                    e = str;
                }
                obj.b = e;
                String e2 = inputData.e("attachLocalId");
                if (e2 == null) {
                    e2 = str;
                }
                obj.f = e2;
                obj.c = inputData.d("lastModified", 0);
                long d = inputData.d("key.messageId", 0);
                long d2 = inputData.d("key.chatId", 0);
                String e3 = inputData.e("key.attachLocalId");
                obj.a = new nw8(d, e3 == null ? str : e3, d2);
                String e4 = inputData.e("uploadType");
                if (e4 == null) {
                    e4 = str;
                }
                obj.d = h4f.w(e4);
                if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                    i20 i20 = new i20(1);
                    i20.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                    String e5 = inputData.e("messageUpload.videoConvertOptions.quality");
                    if (e5 != null) {
                        str = e5;
                    }
                    i20.a = mqb.valueOf(str);
                    i20.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                    i20.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                    ref = new ref(i20);
                } else {
                    ref = null;
                }
                obj.e = ref;
                return new iy8(obj);
            case 1:
                return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
            case 2:
                return ((jyc) this.b.getTamComponent()).f();
            case 3:
                return (sna) ((jyc) this.b.getTamComponent()).getAccessor().c(sna.class);
            case 4:
                return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
            case 5:
                return (ige) ((jyc) this.b.getTamComponent()).getAccessor().c(ige.class);
            case 6:
                return ((jyc) this.b.getTamComponent()).k();
            case 7:
                return ((jyc) this.b.getTamComponent()).q();
            case 8:
                return ((jyc) this.b.getTamComponent()).s();
            case 9:
                return (d00) ((jyc) this.b.getTamComponent()).getAccessor().c(d00.class);
            case 10:
                return (gh3) ((jyc) this.b.getTamComponent()).getAccessor().c(gh3.class);
            case 11:
                return (py8) ((jyc) this.b.getTamComponent()).getAccessor().c(py8.class);
            case Protos.Attaches.Attach.PRESENT:
                return ((jyc) this.b.getTamComponent()).e();
            case 13:
                return ((jyc) this.b.getTamComponent()).n();
            default:
                return ((jyc) this.b.getTamComponent()).u();
        }
    }
}
