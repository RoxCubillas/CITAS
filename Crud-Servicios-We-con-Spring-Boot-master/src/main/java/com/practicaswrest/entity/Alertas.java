
package com.practicaswrest.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alertas")
public class Alertas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @OneToOne
    @JoinColumn(name = "cita_id")
    private Citas citas;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the citas
     */
    public Citas getCitas() {
        return citas;
    }

    /**
     * @param citas the citas to set
     */
    public void setCitas(Citas citas) {
        this.citas = citas;
    }
    
}
