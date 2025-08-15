package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* renamed from: c2e  reason: default package */
public final /* synthetic */ class c2e implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ StereoRoomCommandExecutorImpl b;
    public final /* synthetic */ m56 c;

    public /* synthetic */ c2e(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, m56 m56, int i) {
        this.a = i;
        this.b = stereoRoomCommandExecutorImpl;
        this.c = m56;
    }

    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$9(this.b, this.c, jSONObject);
                return;
            case 1:
                StereoRoomCommandExecutorImpl.requestPromotion$lambda$3(this.b, this.c, jSONObject);
                return;
            case 2:
                StereoRoomCommandExecutorImpl.acceptPromotion$lambda$5(this.b, this.c, jSONObject);
                return;
            default:
                StereoRoomCommandExecutorImpl.promoteParticipant$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}
