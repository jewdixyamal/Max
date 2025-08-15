package defpackage;

import ru.ok.tamtam.nano.Protos;

/* renamed from: fa4  reason: default package */
public final /* synthetic */ class fa4 implements f6 {
    public final /* synthetic */ int a;

    public /* synthetic */ fa4(int i) {
        this.a = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                hm9.k("ga4", "clear: cleared repository");
                return;
            case 1:
                hm9.k("sc5", "onAssetsUpdate: stored fav sticker sets");
                return;
            case 2:
                hm9.k("sc5", "clear: cleared fav stickers repository");
                return;
            case 3:
                hm9.k("md5", "clear: cleared repository");
                return;
            case 4:
                hm9.k("k9c", "clearRecentSearch: success");
                return;
            case 5:
                hm9.m("x9c", "RECENT ADDED update handle success", new Object[0]);
                return;
            case 6:
                hm9.m("x9c", "RECENT REMOVED update handle success", new Object[0]);
                return;
            case 7:
                hm9.m("x9c", "Add to recents success", new Object[0]);
                return;
            case 8:
                w4d w4d = cqc.a;
                return;
            case 9:
                hm9.k("o2e", "Success update recents");
                return;
            case 10:
                hm9.k("o2e", "clear: cleared repository");
                return;
            case 11:
                hm9.k("a4e", "clear: repository cleared");
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                hm9.k("c7f", "clear: cleared upload repository");
                return;
            default:
                hm9.k("wef", "clear: success");
                return;
        }
    }
}
