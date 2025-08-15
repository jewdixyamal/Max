package defpackage;

import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;

/* renamed from: ht6  reason: default package */
public final /* synthetic */ class ht6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IdMappingWrapper b;

    public /* synthetic */ ht6(IdMappingWrapper idMappingWrapper, int i) {
        this.a = i;
        this.b = idMappingWrapper;
    }

    public final void run() {
        int i = this.a;
        IdMappingWrapper idMappingWrapper = this.b;
        switch (i) {
            case 0:
                idMappingWrapper.writeCacheToDisk();
                return;
            default:
                idMappingWrapper.readCacheFromDisk();
                return;
        }
    }
}
