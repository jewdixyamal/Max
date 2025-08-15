package defpackage;

import ru.ok.messages.settings.caching.FrgCachingSettings;

/* renamed from: o46  reason: default package */
public final /* synthetic */ class o46 implements qj3, nod {
    public final /* synthetic */ FrgCachingSettings a;

    public /* synthetic */ o46(FrgCachingSettings frgCachingSettings) {
        this.a = frgCachingSettings;
    }

    public String a(float f) {
        return this.a.G1[(int) f];
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [hc3, java.lang.Object] */
    public void accept(Object obj) {
        zl4 zl4 = (zl4) obj;
        FrgCachingSettings frgCachingSettings = this.a;
        if (frgCachingSettings.y1 == null) {
            frgCachingSettings.y1 = new Object();
        }
        frgCachingSettings.y1.a(zl4);
    }
}
