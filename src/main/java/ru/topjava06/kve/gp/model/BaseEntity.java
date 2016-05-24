package ru.topjava06.kve.gp.model;

public class BaseEntity {

    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BaseEntity() {

    }
    protected BaseEntity(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseEntity that = (BaseEntity) o;
        return !(id == null || that.id == null) && id.equals(that.id);
    }
    @Override
    public int hashCode() {
        return (id == null) ? 0 : id;
    }
}
