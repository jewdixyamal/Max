package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: iz0  reason: default package */
public final /* synthetic */ class iz0 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, ru.ok.android.externcalls.sdk.audio.CallsAudioManager$DisabledAudioDeviceUsagePolicy] */
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                xs xsVar = (xs) obj;
                if (xsVar.isEmpty()) {
                    return xsVar;
                }
                List<ConversationParticipant> list = (List) this.b;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                for (ConversationParticipant externalId : list) {
                    arrayList.add(Long.valueOf(mqa.b(externalId.getExternalId()).a));
                }
                xs xsVar2 = new xs(0);
                qs qsVar = new qs(xsVar);
                while (qsVar.hasNext()) {
                    Object next = qsVar.next();
                    if (!arrayList.contains(Long.valueOf(((Number) next).longValue()))) {
                        xsVar2.add(next);
                    }
                }
                return xsVar2;
            case 1:
                xs xsVar3 = (xs) obj;
                xsVar3.remove(Long.valueOf(((gg1) this.b).a));
                return xsVar3;
            case 2:
                CallsAudioManager callsAudioManager = (CallsAudioManager) obj;
                if (callsAudioManager != null) {
                    return callsAudioManager;
                }
                uq1 uq1 = ((a11) this.b).a;
                uq1.getClass();
                CallsAudioManager.Builder disabledAudioDeviceUsagePolicy = new CallsAudioManager.Builder().setContext((Context) uq1.a.getValue()).setProximityTracker(uq1.c).setVideoTracker(new ync(20, new sq1(0, 0, r21.class, uq1.b.getValue(), "isVideoEnabled", "isVideoEnabled()Z"))).setDisabledAudioDeviceUsagePolicy(new Object());
                ((x6a) uq1.d.getValue()).getClass();
                qyc qyc = (qyc) ((y7d) uq1.e.getValue());
                qyc.getClass();
                if (((int) qyc.q(PmsKey.f28debugmode, (long) 0)) == 3) {
                    disabledAudioDeviceUsagePolicy.setLogger((rq1) uq1.f.getValue());
                }
                return disabledAudioDeviceUsagePolicy.build();
            case 3:
                de2 de2 = (de2) obj;
                return (de2) this.b;
            case 4:
                String str = (String) obj;
                return ((sb8) this.b).x();
            case 5:
                zc8 zc8 = (zc8) obj;
                return (zc8) this.b;
            case 6:
                v1e v1e = (v1e) obj;
                return (v1e) this.b;
            case 7:
                ms7 ms7 = (ms7) obj;
                return (ms7) this.b;
            case 8:
                spa spa = (spa) obj;
                return (spa) this.b;
            case 9:
                Set G0 = x53.G0((Set) obj);
                G0.add((gza) this.b);
                return G0;
            default:
                Long l = (Long) obj;
                return Long.valueOf(((d4e) ((r0d) this.b)).o);
        }
    }
}
