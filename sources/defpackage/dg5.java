package defpackage;

import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: dg5  reason: default package */
public final class dg5 {
    public final v7g a;
    public final rm4 b;
    public final rm4 c;

    public dg5(v7g v7g, rm4 rm4, rm4 rm42) {
        this.a = v7g;
        this.b = rm4;
        this.c = rm42;
    }

    public final void a(long j) {
        try {
            List<iy8> list = (List) new o28(new e0a(new q28(new o28(((py8) this.c.get()).b(), 2, new c10(j, 24)), new jj9(2), 0), new hj8(15), 3).v(), 2, new hj8(17)).c(nz4.a);
            for (iy8 iy8 : list) {
                nw8 nw8 = iy8.a;
                this.a.c("UploadFileAttachWorker:" + nw8.b + ":" + nw8.a + ":" + nw8.c);
            }
            hm9.m("dg5", "success! cancel attach %d uploads", Integer.valueOf(list.size()));
        } catch (Throwable th) {
            hm9.p("dg5", "failure to cancel attach uploads", th);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [lh4, java.lang.Object] */
    public final void b(long j) {
        try {
            uqd a2 = ((up4) this.b.get()).a();
            ? obj = new Object();
            obj.a = j;
            List<lp4> list = (List) new o28(new e0a(new q28(new o28(a2, 2, obj), yxc.X, 0), c32.o, 3).v(), 2, nd2.o).b();
            if (list != null) {
                for (lp4 lp4 : list) {
                    ep4 ep4 = lp4.a;
                    this.a.c("UploadDraftMediaWorker/" + ep4.a + ":" + ep4.b);
                }
            }
            hm9.m("dg5", "success! cancel draft %d uploads", list != null ? Integer.valueOf(list.size()) : null);
        } catch (Exception e) {
            hm9.p("dg5", "failure in cancelling draft uploads other workers", e);
        }
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [hy8, java.lang.Object] */
    public final void c(o2 o2Var, long j, long j2, String str) {
        ref ref;
        int i = o2Var.a;
        int i2 = 7;
        if (i != 1) {
            i2 = i != 2 ? i != 3 ? i != 7 ? i != 10 ? i != 11 ? 1 : 9 : 8 : 5 : 2 : 6;
        } else if (!(o2Var instanceof y95)) {
            i2 = 3;
        }
        if (i2 == 1) {
            hm9.q("FileAttachUploader", "upload: failed, unknown media type = %s", Integer.valueOf(i));
            return;
        }
        nw8 nw8 = new nw8(j, str, j2);
        ? obj = new Object();
        obj.a = nw8;
        obj.d = i2;
        obj.b = o2Var.a();
        obj.c = pag.u(o2Var.a());
        if (!(o2Var instanceof vgf)) {
            ref = null;
        } else {
            ref ref2 = ((vgf) o2Var).c;
            mqb mqb = ref2.a;
            i20 i20 = new i20(1);
            i20.a = mqb;
            i20.b = ref2.b;
            i20.c = ref2.c;
            i20.d = ref2.d;
            ref = new ref(i20);
        }
        obj.e = ref;
        d(new iy8(obj));
    }

    public final void d(iy8 iy8) {
        hm9.m("UploadFileAttachWorker", "start %s", iy8);
        StringBuilder sb = new StringBuilder("UploadFileAttachWorker:");
        nw8 nw8 = iy8.a;
        sb.append(nw8.b);
        sb.append(":");
        long j = nw8.a;
        sb.append(j);
        sb.append(":");
        String str = nw8.c;
        sb.append(str);
        String sb2 = sb.toString();
        qla qla = (qla) ((qla) ((qla) new qla(UploadFileAttachWorker.class).setExpedited(jna.a)).setBackoffCriteria(mf0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("UploadFileAttachWorker");
        HashMap hashMap = new HashMap();
        hashMap.put("workName", sb2);
        hashMap.put("key.messageId", Long.valueOf(j));
        hashMap.put("key.chatId", Long.valueOf(nw8.b));
        hashMap.put("key.attachLocalId", str);
        hashMap.put(ClientCookie.PATH_ATTR, iy8.b);
        hashMap.put("lastModified", Long.valueOf(iy8.c));
        hashMap.put("uploadType", h4f.r(iy8.d));
        hashMap.put("attachLocalId", iy8.f);
        ref ref = iy8.e;
        if (ref != null) {
            hashMap.put("messageUpload.videoConvertOptions", true);
            hashMap.put("messageUpload.videoConvertOptions.quality", ref.a.name());
            hashMap.put("messageUpload.videoConvertOptions.startTrimPosition", Float.valueOf(ref.b));
            hashMap.put("messageUpload.videoConvertOptions.endTrimPosition", Float.valueOf(ref.c));
            hashMap.put("messageUpload.videoConvertOptions.mute", Boolean.valueOf(ref.d));
        }
        d24 d24 = new d24((Map) hashMap);
        d24.f(d24);
        h65 h65 = h65.b;
        this.a.b(sb2, h65, (rla) ((qla) qla.setInputData(d24)).build(), false).l();
    }
}
