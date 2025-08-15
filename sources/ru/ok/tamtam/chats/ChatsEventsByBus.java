package ru.ok.tamtam.chats;

import androidx.annotation.Keep;
import java.util.Collections;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/tamtam/chats/ChatsEventsByBus;", "Lci0;", "Ll6f;", "updateMessageEvent", "Le5f;", "onEvent", "(Ll6f;)V", "Lvz2;", "chatsUpdateEvent", "(Lvz2;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
final class ChatsEventsByBus extends ci0 {
    @uae
    @Keep
    public final void onEvent(l6f l6f) {
        if (l6f.X) {
            a(new gt2(Collections.singleton(Long.valueOf(l6f.b)), false, wz4.a));
        }
    }

    @uae
    @Keep
    public final void onEvent(vz2 vz2) {
        a(new gt2(new xs(vz2.b), vz2.c, vz2.s0));
    }
}
