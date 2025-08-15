package ru.ok.android.externcalls.sdk.stereo.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "internalId", "Le5f;", "invoke", "(Lbg1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomManagerImpl$promoteParticipant$1 extends rd7 implements m56 {
    final /* synthetic */ m56 $onError;
    final /* synthetic */ k56 $onSuccess;
    final /* synthetic */ StereoRoomManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomManagerImpl$promoteParticipant$1(StereoRoomManagerImpl stereoRoomManagerImpl, k56 k56, m56 m56) {
        super(1);
        this.this$0 = stereoRoomManagerImpl;
        this.$onSuccess = k56;
        this.$onError = m56;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((bg1) obj);
        return e5f.a;
    }

    public final void invoke(bg1 bg1) {
        this.this$0.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(bg1, true), this.$onSuccess, this.$onError);
    }
}
