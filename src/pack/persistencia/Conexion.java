/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.persistencia;

import java.sql.Connection;

/**
 *
 * @author root
 */
public interface Conexion {
    public void start();
    public void close();
}
