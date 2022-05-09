package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ciudades")
public class Ciudad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ciudad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", ciudad='" + ciudad + '\'' + '}';
    }
}
