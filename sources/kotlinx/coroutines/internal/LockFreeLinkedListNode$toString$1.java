package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class LockFreeLinkedListNode$toString$1 extends gob {
    public LockFreeLinkedListNode$toString$1(Object obj) {
        super(obj, c54.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    public Object get() {
        return this.receiver.getClass().getSimpleName();
    }
}
