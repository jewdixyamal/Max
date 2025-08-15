package defpackage;

import ru.ok.tamtam.android.calls.MediaProjectionService;

/* renamed from: cf8  reason: default package */
public final /* synthetic */ class cf8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaProjectionService b;

    public /* synthetic */ cf8(MediaProjectionService mediaProjectionService, int i) {
        this.a = i;
        this.b = mediaProjectionService;
    }

    public final Object invoke() {
        MediaProjectionService mediaProjectionService = this.b;
        switch (this.a) {
            case 0:
                int i = MediaProjectionService.X;
                return np8.D(mediaProjectionService).h();
            default:
                int i2 = MediaProjectionService.X;
                return np8.D(mediaProjectionService).l();
        }
    }
}
