package defpackage;

import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: sq1  reason: default package */
public final /* synthetic */ class sq1 extends ni9 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.a = i2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                CameraManager a2 = ((r21) this.receiver).a();
                boolean z = false;
                if (a2 != null && a2.isCameraEnabled()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return ((hi9) this.receiver).a;
            case 2:
                return ((hi9) this.receiver).c;
            case 3:
                return ((hi9) this.receiver).b;
            case 4:
                return ((hi9) this.receiver).a;
            case 5:
                return ((hi9) this.receiver).b;
            case 6:
                return ((hi9) this.receiver).c;
            case 7:
                return ((hi9) this.receiver).d;
            case 8:
                return ((hi9) this.receiver).a;
            case 9:
                return ((hi9) this.receiver).b;
            case 10:
                return ((hi9) this.receiver).c;
            case 11:
                return ((hi9) this.receiver).d;
            default:
                return ((hi9) this.receiver).d;
        }
    }

    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CameraManager a2 = ((r21) this.receiver).a();
                if (a2 != null) {
                    a2.setCameraEnabled(booleanValue);
                    return;
                }
                return;
            case 1:
                ((hi9) this.receiver).a = (rd8) obj;
                return;
            case 2:
                ((hi9) this.receiver).c = (rd8) obj;
                return;
            case 3:
                ((hi9) this.receiver).b = (rd8) obj;
                return;
            case 4:
                ((hi9) this.receiver).a = (rd8) obj;
                return;
            case 5:
                ((hi9) this.receiver).b = (rd8) obj;
                return;
            case 6:
                ((hi9) this.receiver).c = (rd8) obj;
                return;
            case 7:
                ((hi9) this.receiver).d = (rd8) obj;
                return;
            case 8:
                ((hi9) this.receiver).a = (rd8) obj;
                return;
            case 9:
                ((hi9) this.receiver).b = (rd8) obj;
                return;
            case 10:
                ((hi9) this.receiver).c = (rd8) obj;
                return;
            case 11:
                ((hi9) this.receiver).d = (rd8) obj;
                return;
            default:
                ((hi9) this.receiver).d = (rd8) obj;
                return;
        }
    }
}
