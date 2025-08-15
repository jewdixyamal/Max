package ru.ok.android.externcalls.sdk.stereo.hands;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomHandsQueueImpl$loadMoreElements$1 extends rd7 implements k56 {
    final /* synthetic */ m56 $onSuccess;
    final /* synthetic */ StereoRoomHandsQueueImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomHandsQueueImpl$loadMoreElements$1(m56 m56, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        super(0);
        this.$onSuccess = m56;
        this.this$0 = stereoRoomHandsQueueImpl;
    }

    public final void invoke() {
        m56 m56 = this.$onSuccess;
        if (m56 != null) {
            m56.invoke(this.this$0);
        }
    }
}
