package defpackage;

import bolts.Task;

/* renamed from: hne  reason: default package */
public final class hne implements gu3 {
    public final Object a(Task task) {
        return task.isCancelled() ? Task.cancelled() : task.isFaulted() ? Task.forError(task.getError()) : Task.forResult(null);
    }
}
