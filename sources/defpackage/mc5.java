package defpackage;

/* renamed from: mc5  reason: default package */
public final /* synthetic */ class mc5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ mc5() {
        this.a = 3;
        this.b = 0;
    }

    public final void run() {
        long j = this.b;
        switch (this.a) {
            case 0:
                hm9.m("sc5", "onNotifAdded: added sticker set %d to cache", Long.valueOf(j));
                return;
            case 1:
                hm9.m("sc5", "loadFromMarker: success marker=d", Long.valueOf(j));
                return;
            case 2:
                hm9.m("dd5", "assetsUpdate: queued on api, sync=%d", Long.valueOf(j));
                return;
            case 3:
                hm9.m("hd5", "assetsUpdate: queued on api, sync=%d", Long.valueOf(j));
                return;
            case 4:
                hm9.m("md5", "onNotifAdded: added sticker %d to cache", Long.valueOf(j));
                return;
            case 5:
                hm9.m("md5", "loadFromMarker: success marker=d", Long.valueOf(j));
                return;
            default:
                hm9.m("fk9", "Update track for message %d: track is empty", Long.valueOf(j));
                return;
        }
    }

    public /* synthetic */ mc5(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
