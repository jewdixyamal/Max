package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import android.util.Size;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ru.ok.tamtam.nano.Protos;

/* renamed from: mu1  reason: default package */
public final /* synthetic */ class mu1 implements l66 {
    public final /* synthetic */ int a;

    public /* synthetic */ mu1(int i) {
        this.a = i;
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                Void voidR = (Void) obj;
                return Boolean.TRUE;
            case 1:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) obj;
                int i = xu1.g;
                return Boolean.FALSE;
            case 4:
                TotalCaptureResult totalCaptureResult3 = (TotalCaptureResult) obj;
                int i2 = zu1.h;
                return Boolean.FALSE;
            case 5:
                return new l9b((k9b) obj);
            case 6:
                List list = (List) obj;
                du6 du6 = fu6.A;
                return null;
            case 7:
                oq7 oq7 = (oq7) obj;
                oq7.g = false;
                oq7.h = false;
                return oq7;
            case 8:
                oq7 oq72 = (oq7) obj;
                oq72.e = false;
                return oq72;
            case 9:
                oq7 oq73 = (oq7) obj;
                oq73.g = true;
                oq73.h = true;
                return oq73;
            case 10:
                oq7 oq74 = (oq7) obj;
                oq74.e = true;
                return oq74;
            case 11:
                oq7 oq75 = (oq7) obj;
                oq75.e = false;
                oq75.g = false;
                oq75.h = false;
                return oq75;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                oq7 oq76 = (oq7) obj;
                oq76.g = false;
                oq76.h = false;
                oq76.e = false;
                return oq76;
            case 13:
                oq7 oq77 = (oq7) obj;
                oq77.e = false;
                oq77.g = false;
                oq77.h = false;
                return oq77;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                oq7 oq78 = (oq7) obj;
                oq78.a = true;
                oq78.c = true;
                oq78.b = false;
                return oq78;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                List list2 = (List) obj;
                return null;
            case 16:
                try {
                    return fff.a(eff.Z1((ic0) obj), (Size) null);
                } catch (InvalidConfigException unused) {
                    return null;
                }
            default:
                List<g8g> list3 = (List) obj;
                if (list3 != null) {
                    arrayList = new ArrayList(z53.S(list3, 10));
                    for (g8g g8g : list3) {
                        List list4 = g8g.g;
                        arrayList.add(new n7g(UUID.fromString(g8g.a), g8g.b, g8g.c, (ArrayList) g8g.f, list4.isEmpty() ^ true ? (d24) list4.get(0) : d24.b, g8g.d, g8g.e));
                    }
                }
                return arrayList;
        }
    }
}
