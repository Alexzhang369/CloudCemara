package com.codingbingoZTT.BanmaReader.model.eventbus;

/**
 *
 *
 * By 2017/4/18.
 */

public class BookReadProgressChangeEvent {
    private int progress;
    private long bookId;

    public BookReadProgressChangeEvent() {
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
}
