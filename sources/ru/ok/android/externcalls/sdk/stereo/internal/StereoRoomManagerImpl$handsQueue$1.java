package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.List;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class StereoRoomManagerImpl$handsQueue$1 extends p66 implements a66 {
    public StereoRoomManagerImpl$handsQueue$1(Object obj) {
        super(2, 0, StereoRoomManagerImpl.class, obj, "resolveIdsAndThen", "resolveIdsAndThen(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((List<bg1>) (List) obj, (k56) obj2);
        return e5f.a;
    }

    public final void invoke(List<bg1> list, k56 k56) {
        ((StereoRoomManagerImpl) this.receiver).resolveIdsAndThen(list, k56);
    }
}
