package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: f7f  reason: default package */
public final /* synthetic */ class f7f implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadDraftMediaWorker b;

    public /* synthetic */ f7f(UploadDraftMediaWorker uploadDraftMediaWorker, int i) {
        this.a = i;
        this.b = uploadDraftMediaWorker;
    }

    public final Object invoke() {
        ref ref;
        switch (this.a) {
            case 0:
                d24 inputData = this.b.getInputData();
                long d = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0);
                String e = inputData.e("attachLocalId");
                String str = "";
                if (e == null) {
                    e = str;
                }
                ep4 ep4 = new ep4(d, e);
                String e2 = inputData.e("draft.path");
                String str2 = e2 == null ? str : e2;
                long d2 = inputData.d("draft.lastModified", 0);
                String e3 = inputData.e("draft.uploadType");
                if (e3 == null) {
                    e3 = str;
                }
                int w = h4f.w(e3);
                if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                    i20 i20 = new i20(1);
                    i20.d = inputData.b("draft.videoConvertOptions.mute", false);
                    String e4 = inputData.e("draft.videoConvertOptions.quality");
                    if (e4 != null) {
                        str = e4;
                    }
                    i20.a = mqb.valueOf(str);
                    i20.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                    i20.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                    ref = new ref(i20);
                } else {
                    ref = null;
                }
                return new lp4(ep4, str2, d2, w, ref);
            case 1:
                return ((jyc) this.b.getTamComponent()).k();
            case 2:
                return (dg5) ((jyc) this.b.getTamComponent()).getAccessor().c(dg5.class);
            case 3:
                return ((jyc) this.b.getTamComponent()).s();
            case 4:
                return (up4) ((jyc) this.b.getTamComponent()).getAccessor().c(up4.class);
            case 5:
                return ((jyc) this.b.getTamComponent()).u();
            case 6:
                return ((jyc) this.b.getTamComponent()).f();
            case 7:
                return (jp4) ((jyc) this.b.getTamComponent()).getAccessor().c(jp4.class);
            case 8:
                return (eoe) ((jyc) this.b.getTamComponent()).getAccessor().c(eoe.class);
            case 9:
                return (g8f) ((jyc) this.b.getTamComponent()).getAccessor().c(g8f.class);
            default:
                hle t = ((jyc) this.b.getTamComponent()).t();
                t.getClass();
                return ((jle) t).a();
        }
    }
}
