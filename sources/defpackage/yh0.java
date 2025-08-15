package defpackage;

import one.me.android.OneMeApplication;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* renamed from: yh0  reason: default package */
public final /* synthetic */ class yh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ yh0(int i, k56 k56) {
        this.a = i;
        this.b = k56;
    }

    public final void run() {
        k56 k56 = this.b;
        switch (this.a) {
            case 0:
                BaseCallParams.Builder.setOnPrepared$lambda$6$lambda$5(k56);
                return;
            case 1:
                k56.invoke();
                return;
            case 2:
                k56.invoke();
                return;
            case 3:
                k56.invoke();
                return;
            case 4:
                k56.invoke();
                return;
            case 5:
                k56.invoke();
                return;
            case 6:
                int i = OneMeApplication.s0;
                k56.invoke();
                return;
            case 7:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$8(k56);
                return;
            case 8:
                StereoRoomManagerImpl.revokeRoles$lambda$6(k56);
                return;
            case 9:
                StereoRoomManagerImpl.resolveIdsAndThen$lambda$9(k56);
                return;
            case 10:
                StereoRoomManagerImpl.grantAdmin$lambda$2$lambda$0(k56);
                return;
            default:
                StereoRoomManagerImpl.revokeAdmin$lambda$5$lambda$3(k56);
                return;
        }
    }
}
