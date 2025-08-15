package defpackage;

import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* renamed from: hy0  reason: default package */
public final /* synthetic */ class hy0 implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ hy0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                cq1 a2 = ((py0) this.b).N1.a(jSONObject);
                if (a2 != null) {
                    ((rj3) this.c).accept(a2);
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case 1:
                JSONObject optJSONObject = jSONObject.optJSONObject("rooms");
                ipd E = optJSONObject != null ? ((pl8) ((imc) this.b).b).E(optJSONObject) : null;
                if (E == null) {
                    ((m56) this.c).invoke(new RuntimeException("Can't parse rooms from " + jSONObject));
                    return;
                }
                ((m56) this.o).invoke(E);
                return;
            case 2:
                ParticipantStatesManagerImpl.updateOwnStateInternal$lambda$19((qod) this.b, (ParticipantStatesManagerImpl) this.c, (Map) this.o, jSONObject);
                return;
            case 3:
                RecordManagerImpl.stopRecord$lambda$3((RecordManagerImpl) this.b, (RecordManager.StopParams) this.c, (m56) this.o, jSONObject);
                return;
            case 4:
                RecordManagerImpl.startRecord$lambda$1((RecordManagerImpl) this.b, (RecordManager.StartParams) this.c, (m56) this.o, jSONObject);
                return;
            default:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$8((StereoRoomCommandExecutorImpl) this.b, (m56) this.c, (c66) this.o, jSONObject);
                return;
        }
    }
}
